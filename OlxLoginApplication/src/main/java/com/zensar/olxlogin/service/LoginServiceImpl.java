package com.zensar.olxlogin.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olxlogin.entity.User;
import com.zensar.olxlogin.repository.OlxRepository;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private OlxRepository olxReposiotry;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	
	@Override
	public List<User> getAllUsers() {
		
		return olxReposiotry.findAll();
	}

	@Override
	public User userAuthentication(User user, String token) {
		/*
		 * for(User user1 : olxReposiotry.) { if(user1.getUserName()=="anand" &&
		 * user1.getPassword()=="anand123") {
		 * 
		 * }
		 * 
		 * }
		 */ return null;
		 
	}

	@Override
	public User createStock(User user) {
		return olxReposiotry.save(user);
	}

	@Override
	public boolean deleteAllUser(String token) {
		if(token.equals("aa66471"))
		{
			olxReposiotry.deleteAll();
			return true;
					
		}
		else
		{
			return false;
		}
	}

}
