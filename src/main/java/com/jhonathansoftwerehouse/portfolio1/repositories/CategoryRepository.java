package com.jhonathansoftwerehouse.portfolio1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonathansoftwerehouse.portfolio1.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
