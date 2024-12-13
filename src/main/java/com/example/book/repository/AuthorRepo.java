package com.example.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.book.entity.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {

}
