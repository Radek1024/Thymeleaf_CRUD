package com.radek.thymeleaf_crud.service;

import com.radek.thymeleaf_crud.repository.BookRepository;
import com.radek.thymeleaf_crud.repository.LibrarianRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final LibrarianRepository librarianRepository;
    private final BookRepository bookRepository;

    public BookService(LibrarianRepository librarianRepository, BookRepository bookRepository) {
        this.librarianRepository = librarianRepository;
        this.bookRepository = bookRepository;
    }
}
