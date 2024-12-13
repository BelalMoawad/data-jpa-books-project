package com.example.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.entity.Author;
import com.example.book.repository.AuthorRepo;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepo authorRepo;
	
	public Author findById(Long id) {
		return authorRepo.findById(id).orElseThrow();		
	}
}
