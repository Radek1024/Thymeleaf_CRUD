package com.radek.thymeleaf_crud.service;

import com.radek.thymeleaf_crud.entity.Librarian;
import com.radek.thymeleaf_crud.repository.AdminRepository;
import com.radek.thymeleaf_crud.repository.LibrarianRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {
    private LibrarianRepository librarianRepository;

    public AdminService(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }

    public void addLibrarian(Librarian librarian){
        librarianRepository.save(librarian);
    }

    public List<Librarian> getLibrarians(){
        List<Librarian> librarians = new ArrayList<>();

        for (Librarian l : librarianRepository.findAll()){
            librarians.add(l);
        }

        return librarians;
    }
}
