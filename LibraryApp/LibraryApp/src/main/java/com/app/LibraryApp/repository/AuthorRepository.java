package com.app.LibraryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.LibraryApp.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

	public Author findByAuthorName(String authorName);
}
