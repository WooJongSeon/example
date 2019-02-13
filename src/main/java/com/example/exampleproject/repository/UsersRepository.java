package com.example.exampleproject.repository;

import com.example.exampleproject.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    //Users findByUserIdAndPassword(String userId, String userPw);
}
