package com.app.LibraryApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.LibraryApp.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	@Query(value = "SELECT * FROM ((book b INNER JOIN author a ON b.author_id = a.author_id) INNER JOIN publisher p ON p.publisher_id = b.publisher_id) WHERE b.book_name LIKE %:keyword% OR a.author_name LIKE %:keyword% OR b.serial_name LIKE %:keyword% OR b.isbn_no LIKE %:keyword%", nativeQuery = true)
	List<Book> findBooksByKeyword(@Param("keyword") String keyword);

	@Query(value = "SELECT count(*) FROM book", nativeQuery = true)
	public int bookCount();

}
  