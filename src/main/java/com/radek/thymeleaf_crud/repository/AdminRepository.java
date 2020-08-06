package com.radek.thymeleaf_crud.repository;

import com.radek.thymeleaf_crud.entity.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {


}
