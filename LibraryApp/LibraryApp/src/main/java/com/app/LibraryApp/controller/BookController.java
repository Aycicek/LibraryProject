package com.app.LibraryApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.LibraryApp.model.Author;
import com.app.LibraryApp.model.Book;
import com.app.LibraryApp.model.Publisher;
import com.app.LibraryApp.repository.AuthorRepository;
import com.app.LibraryApp.repository.BookRepository;
import com.app.LibraryApp.repository.PublisherRepository;
import com.app.LibraryApp.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public String listBook(Model model) {
		List<Book> listBooks = bookRepository.findAll();
		int count = bookService.bookCount();
		model.addAttribute("count", count);
		model.addAttribute("listBooks", listBooks);
		return "books";
	}

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private PublisherRepository publisherRepository;

	@GetMapping("/books/new")
	public String showNewBookForm(Model model) {
		List<Author> listAuthors = authorRepository.findAll();
		List<Publisher> listPublishers = publisherRepository.findAll();
		model.addAttribute("book", new Book());
		model.addAttribute("listAuthors", listAuthors);
		model.addAttribute("listPublishers", listPublishers);
		return "book_form";
	}

	@PostMapping("/books/save")
	public String saveBook(@Valid Book book, Errors errors) {
		bookRepository.save(book);
		return "redirect:/books";

	}

	@GetMapping("books/edit/{bookId}")
	public String showEditBookForm(@PathVariable("bookId") Integer id, Model model) {
		Book book = bookRepository.findById(id).get();
		model.addAttribute("book", book);

		List<Author> listAuthors = authorRepository.findAll();
		List<Publisher> listPublishers = publisherRepository.findAll();
		model.addAttribute("listAuthors", listAuthors);
		model.addAttribute("listPublishers", listPublishers);
		return "book_form";

	}

	@GetMapping("books/delete/{bookId}")
	public String deleteBook(@PathVariable("bookId") Integer id, Model model) {
		bookRepository.deleteById(id);

		return "redirect:/books";

	}

	@PostMapping("/showSearchResult")
	public String showSearchResult(@ModelAttribute("searchWord") String searchWord, Model model) {
		List<Book> foundedBooks = bookService.getSearchBooks(searchWord);
		model.addAttribute("foundedBooks", foundedBooks);
		model.addAttribute("searchWord", searchWord);
		model.addAttribute("foundedBooksSize", foundedBooks.size());
		return "search_result";
	}

	@GetMapping("/403")
	public String error403() {
		return "403";
	}

}
