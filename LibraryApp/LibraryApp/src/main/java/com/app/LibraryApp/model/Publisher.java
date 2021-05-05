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
@Table(name = "publisher")
public class Publisher {
	
	@Id
	@Column(name = "publisher_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int publisherId;

	@Column(name = "publisher_name")
	private String publisherName;

	@Column(name = "publisher_description")
	private String publisherDescription;

	public Publisher(String publisherName, String publisherDescription) {
		this.publisherName = publisherName;
		this.publisherDescription = publisherDescription;
	}

}
