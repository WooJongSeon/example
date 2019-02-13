package com.example.exampleproject.service;


import com.example.exampleproject.model.Users;
import com.example.exampleproject.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

//	@Autowired
//	private UsersRepository usersRepository;
//
//	@Autowired
//	private UserPasswordHashClass userPasswordHashClass;

	public String joinUser(String userId , String userPw, String userName) {
//
//		if (userId.equals("") || userPw.equals("") || userName.equals("")) {
//			return "join";
//		}
//
//		Users users = new Users();
//		users.setUser_id(userId);
//		String hashedPassword = userPasswordHashClass.getSHA256(userPw);
//		users.setPassword(hashedPassword);
//		users.setUsername(userName);
//
//		usersRepository.save(users);
		return "index";
	}
}