package com.app.LibraryApp.service;

import java.util.List;

import com.app.LibraryApp.model.Book;

public interface BookService {
	List<Book> getSearchBooks(String searchWord);

	int bookCount();
}
