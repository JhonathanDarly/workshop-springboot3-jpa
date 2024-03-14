package com.jhonathansoftwerehouse.portfolio1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonathansoftwerehouse.portfolio1.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
