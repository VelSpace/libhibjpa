package com.student.library.LibraryManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.library.LibraryManagementSystem.Repository.CardRepository;
import com.student.library.LibraryManagementSystem.Repository.StudentRepository;

@SpringBootApplication
public class LibraryManagementSystemApplication implements CommandLineRunner{

	@Autowired
	CardRepository cardRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student s = new Student("Manikandan",22,"Universe");
		
		Card c = new Card();
		s.setCard(c);
		
		int amount = s.getCard().getFine();
		
		cardRepository.save(c);
		
		studentRepository.save(s);
		
	}

}
