package com.radek.thymeleaf_crud.repository;

import com.radek.thymeleaf_crud.entity.Librarian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends CrudRepository<Librarian,Long> {

}
