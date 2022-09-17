package com.felipe.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.bookstore.entity.Book;
//Essa classe gerencia a conexção com o BD
public interface BookRepository extends JpaRepository<Book, Long>{

}
