package com.app.LibraryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.app.LibraryApp.model.Publisher;
import com.app.LibraryApp.repository.PublisherRepository;

@Controller
public class PublisherController {
	@Autowired
	private PublisherRepository publisherRepository;

	@GetMapping("/publishers")
	public String listPublishers(Model model) {
		List<Publisher> listPublishers = publisherRepository.findAll();
		model.addAttribute("listPublishers", listPublishers);
		return "publishers";
	}

	@GetMapping("/publishers/new")
	public String showPublisherNewForm(Model model) {
		model.addAttribute("publisher", new Publisher());
		return "publisher_form";
	}

	@PostMapping("/publishers/save")
	public String savePublisher(Publisher publisher) {
		publisherRepository.save(publisher);
		return "redirect:/publishers";
	}

}
