package com.app.LibraryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.LibraryApp.model.Author;
import com.app.LibraryApp.repository.AuthorRepository;


@Controller
public class AuthorController {

	@Autowired
	private AuthorRepository authorRepository;

	@GetMapping("/authors")
	public String listAuthors(Model model) {
		List<Author> listAuthors = authorRepository.findAll();
		model.addAttribute("listAuthors", listAuthors);
		return "authors";
	}

	@GetMapping("/authors/new")
	public String showAuthorNewForm(Model model) {
		model.addAttribute("author", new Author());
		return "author_form";
	}

	@PostMapping("/authors/save")
	public String saveAuthor(Author author) {
		authorRepository.save(author);
		return "redirect:/authors";
	}
}
