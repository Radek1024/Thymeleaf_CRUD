package com.radek.thymeleaf_crud.repository;

import com.radek.thymeleaf_crud.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Long>{

}
