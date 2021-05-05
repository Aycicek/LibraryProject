package com.app.LibraryApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.LibraryApp.model.Author;
import com.app.LibraryApp.model.Book;
import com.app.LibraryApp.model.Publisher;
import com.app.LibraryApp.repository.AuthorRepository;
import com.app.LibraryApp.repository.BookRepository;
import com.app.LibraryApp.repository.PublisherRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class BookTests {
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private PublisherRepository publisherRepository;

	@Test
	public void testCreateBook() {
		Author author = new Author("Ahmet Hamdi Tanpınar", "Tanzimat");
		authorRepository.save(author);

		Publisher publisher = new Publisher("Sis", "İyidir");
		publisherRepository.save(publisher);

		Book book = new Book("Tutunamayanlar", "224", "4", author, publisher);
		bookRepository.save(book);

	}
}