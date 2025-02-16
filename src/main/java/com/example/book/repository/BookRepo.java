package com.example.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.book.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
