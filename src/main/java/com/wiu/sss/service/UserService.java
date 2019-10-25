package com.wiu.sss.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiu.sss.dto.user.UserDTO;
import com.wiu.sss.mapper.UserMapper;
import com.wiu.sss.model.User;
import com.wiu.sss.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	@Autowired
	UserMapper mapper;
	
	public UserDTO save(UserDTO user) {
		User map = mapper.map(user);
		userRepository.saveAndFlush(map);
		return mapper.map(map);
	}
	
	public UserDTO find(long id) {
		Optional<User> oUser = userRepository.findById(id);
		oUser.orElseThrow();
		UserDTO map = mapper.map(oUser.get());
		return map;
	}
}
