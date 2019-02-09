package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
    Users findByUserIdAndPassword(String userId, String userPw);
}
