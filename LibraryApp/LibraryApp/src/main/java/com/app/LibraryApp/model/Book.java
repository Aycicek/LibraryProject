package com.app.LibraryApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {

	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;

	@Column(name = "book_name")
	private String bookName;

	@Column(name = "sub_name")
	private String subName;

	@Column(name = "serial_name")
	private String serialName;

	@Column(name = "isbn_no")
	private String isbnNo;

	@Column(name = "number_of_page")
	private String numberOfPage;

	@Column(name = "how_many_star")
	private String howManyStar;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	@ManyToOne
	@JoinColumn(name = "publisher_id")
	private Publisher publisher;

	// Test için yazıldı
	public Book(String bookName, String numberOfPage, String howManyStar, Author author, Publisher publisher) {
		this.bookName = bookName;
		this.numberOfPage = numberOfPage;
		this.howManyStar = howManyStar;
		this.author = author;
		this.publisher = publisher;
	}
}
