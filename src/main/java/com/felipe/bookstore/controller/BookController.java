package com.felipe.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.bookstore.dto.MensageResponseDTO;
import com.felipe.bookstore.entity.Book;
import com.felipe.bookstore.service.BookService;

@RestController // informa que essa classe será uma API REST
@RequestMapping("/api/v1/book") //usada para mapear URLs
public class BookController {
	
	private BookService bookservice;
	
	@Autowired
	public BookController(BookService bookservice) {
		super();
		this.bookservice = bookservice;
	}	

	@PostMapping	//metodo responsavel por passar a requisicao
	public MensageResponseDTO create(@RequestBody Book book) {
		return bookservice.create(book);		
	}
}
