CREATE DATABASE libraryapp;

CREATE TABLE author (
    author_id INT NOT NULL AUTO_INCREMENT,
    author_name VARCHAR(60) DEFAULT NULL,
    author_description VARCHAR(400) DEFAULT NULL,
    PRIMARY KEY (author_id)
);
CREATE TABLE publisher (
    publisher_id INT NOT NULL AUTO_INCREMENT,
    publisher_name VARCHAR(60) DEFAULT NULL,
    publisher_description VARCHAR(400) DEFAULT NULL,
    PRIMARY KEY (publisher_id)
);

CREATE TABLE book (
    book_id INT NOT NULL AUTO_INCREMENT,
    author_id INT NOT NULL,
    publisher_id INT NOT NULL,
    book_name VARCHAR(60) NOT NULL,
	sub_name VARCHAR(60) NULL,
	serial_name VARCHAR(60) NULL,
	number_of_page INT NOT NULL,
    isbn_no VARCHAR(13) NULL,
    how_many_star INT NOT NULL,
    PRIMARY KEY (book_id),
    KEY author_id (author_id),
    KEY publisher_id (publisher_id),
    CONSTRAINT author_id_fk FOREIGN KEY (author_id)
        REFERENCES author (author_id)
        ON DELETE CASCADE,
    CONSTRAINT publisher_id_fk FOREIGN KEY (publisher_id)
        REFERENCES publisher (publisher_id)
        ON DELETE CASCADE
);

CREATE TABLE users (
  user_id INT NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  password varchar(64) NOT NULL,
  PRIMARY KEY (user_id)
);

CREATE TABLE roles (
  role_id INT NOT NULL AUTO_INCREMENT,
  role_name varchar(45) NOT NULL,
  PRIMARY KEY (role_id)
);

CREATE TABLE users_roles (
  user_id INT NOT NULL,
  role_id INT NOT NULL,
  KEY user_fk_idx (user_id),
  KEY role_fk_idx (role_id),
  CONSTRAINT role_fk FOREIGN KEY (role_id) REFERENCES roles (role_id),
  CONSTRAINT user_fk FOREIGN KEY (user_id) REFERENCES users (user_id)
);


INSERT INTO roles (role_name) VALUES ('USER');
INSERT INTO roles (role_name) VALUES ('EDITOR');
INSERT INTO roles (role_name) VALUES ('ADMIN');

INSERT INTO users (username, password) VALUES ('Fatma', '$2a$10$CN/jUYd29O7Jmni.vEtU5eoBbAnAkDRZzkGD8UFCPk2U9rQpGCEZS'); -- 123456
INSERT INTO users (username, password) VALUES ('editor', '$2a$10$Tn93s1PaM19oNR9SHO.W9ek.aqwczI/IQEirdCXhk8ODF5ZAcVKtq'); -- editor
INSERT INTO users (username, password) VALUES ('admin', '$2a$10$QRd9jCQ2Lt.6FXMzPQa9k.gg8nnLaiNJVv3dCiIX5oi6bQK9yY4Hy'); -- admin



INSERT INTO users_roles (user_id, role_id) VALUES (1, 1); 
INSERT INTO users_roles (user_id, role_id) VALUES (2, 1); 
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);
INSERT INTO users_roles (user_id, role_id) VALUES (3, 3);