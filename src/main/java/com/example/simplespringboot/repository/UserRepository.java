package com.example.simplespringboot.repository;

import com.example.simplespringboot.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
