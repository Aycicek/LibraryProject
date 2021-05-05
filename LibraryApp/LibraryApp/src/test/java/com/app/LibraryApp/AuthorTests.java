package com.app.LibraryApp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.LibraryApp.model.Author;
import com.app.LibraryApp.repository.AuthorRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false) // değişimleri geri alma
public class AuthorTests {
	@Autowired
	private AuthorRepository authorRepository;

	@Test
	public void testCreateAuthor() {
		Author author = new Author("Namık Kemal", "Tanzimat Devri Aydını");
		Author savedAuthor = authorRepository.save(author);
		// Beklenen bir sonucun null olup olmadığı kontrol edilir
		assertNotNull(savedAuthor);
	}

	@Test
	public void testFindAuthorByNameExist() {
		String authorName = "Namık Kemal";
		Author author = authorRepository.findByAuthorName(authorName);
		// Yazar adı varmı diye kontrol edilir.
		assertThat(author.getAuthorName()).isEqualTo(authorName);
	}

	@Test
	public void testFindAuthorByNameNotExist() {
		String authorName = "Orhan Veli ";
		Author author = authorRepository.findByAuthorName(authorName);
		// Beklenen bir sonucun null olup olmadığı kontrol edilir
		assertNull(author);
	}

	@Test
	@Rollback(false) // değişimleri geri alma
	public void testUpdateAuthor() {
		// id'si 10 olanın yazar adını değiştirip, değişip değişmediğini kontrol eder
		String authorName = "Orhan Veli";
		Author author = new Author(authorName, "Garip");
		author.setAuthorId(10);

		authorRepository.save(author);

		Author updatedAuthor = authorRepository.findByAuthorName(authorName);

		assertThat(updatedAuthor.getAuthorName()).isEqualTo(authorName);

	}

	@Test
	public void testListAuthors() {
		// Kayıt var mı yok mu test edilir. Kayıtlar ekrana yazılır.
		List<Author> authors = (List<Author>) authorRepository.findAll();

		for (Author author : authors) {
			System.out.println(author);

		}
		assertThat(authors).size().isGreaterThan(0);
	}

	@Test
	@Rollback(false) // değişimleri geri alma
	public void testDeleteAuthor() {
		// id'si 11 olan kaydı sil
		// silmeden önce bu kayıt mevcut mu diye kontrol et
		// sildikten sonra bu kayıt mevcut mu diye kontrol et
		Integer id = 11;

		boolean isExistBeforeDelete = authorRepository.findById(id).isPresent();

		authorRepository.deleteById(id);

		boolean notExistAfterDelete = authorRepository.findById(id).isPresent();

		assertTrue(isExistBeforeDelete);
		assertFalse(notExistAfterDelete);
	}
}
