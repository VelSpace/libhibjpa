package com.student.library.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.library.LibraryManagementSystem.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
