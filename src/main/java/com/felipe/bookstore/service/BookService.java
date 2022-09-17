package com.felipe.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.bookstore.dto.MensageResponseDTO;
import com.felipe.bookstore.entity.Book;
import com.felipe.bookstore.repository.BookRepository;

@Service
public class BookService {

	public BookRepository bookRepository;
	
	@Autowired	// faz a injecao de dependencias
	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	public MensageResponseDTO create(Book book) {
		Book saveBook = bookRepository.save(book);
		
		return MensageResponseDTO.builder()
				.Menssagem("Livro criado com Id " + saveBook.getId())
				.build();		
	}	
}
