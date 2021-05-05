package com.app.LibraryApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.LibraryApp.model.Book;
import com.app.LibraryApp.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getSearchBooks(String searchWord) {
		List<Book> foundedBooks = bookRepository.findBooksByKeyword(searchWord);
		return foundedBooks;

	}

	@Override
	public int bookCount() {
		int count = bookRepository.bookCount();
		return count;
	}

}
 