package com.student.library.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.library.LibraryManagementSystem.Card;

public interface CardRepository extends JpaRepository<Card,Integer>{

}
