package com.app.LibraryApp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
	public static void main(String[] args) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPasword = "editor";//admin, Fatma, editor şifrelerinin kripto halini veritabanına kod ile ekledim
		String encodedPassword = encoder.encode(rawPasword);

		System.out.println(encodedPassword);

	}
}
