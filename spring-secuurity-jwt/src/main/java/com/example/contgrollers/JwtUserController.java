package com.example.contgrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.JwtUser;
import com.example.service.JwtServiceImpl;

@RestController
public class JwtUserController {

    @Autowired
	JwtServiceImpl jwtServiceImpl;
	
	@Autowired
	private PasswordEncoder padPasswordEncoder;
	
	@PostMapping("/register")
	public void addUser(@RequestBody JwtUser jwtUser) {
		String username=jwtUser.getUsername();
		String passWord=jwtUser.getPassword();
		String encodedPassWord=padPasswordEncoder.encode(passWord);
		JwtUser newUser=new JwtUser(username,encodedPassWord);
		
		
		jwtServiceImpl.addUser(jwtUser);
		
		
	}
}
