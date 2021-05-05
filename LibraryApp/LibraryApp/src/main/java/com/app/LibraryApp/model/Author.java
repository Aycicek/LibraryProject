package com.app.LibraryApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "author")
public class Author {

	@Id
	@Column(name = "author_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorId;

	@Column(name = "author_name")
	private String authorName;

	@Column(name = "author_description")
	private String authorDescription;

	// Test için yazıldı
	public Author(String authorName, String authorDescription) {
		this.authorName = authorName;
		this.authorDescription = authorDescription;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", authorDescription="
				+ authorDescription + "]";
	}
	
}
