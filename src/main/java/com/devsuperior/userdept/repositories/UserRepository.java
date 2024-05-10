package com.devsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.userdept.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
