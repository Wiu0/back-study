package com.wiu.sss.mapper;

import org.springframework.stereotype.Component;

import com.wiu.sss.dto.user.UserDTO;
import com.wiu.sss.model.User;

@Component
public class UserMapper {
	
	public User map(UserDTO userDTO) {
		User u = new User();
		u.setFirstName(userDTO.getFirstName());		
		u.setLastName(userDTO.getLastName());
		u.setBornDate(userDTO.getBornDate());
		return u;
	}
	
	public UserDTO map(User user) {
		UserDTO u = new UserDTO();
		u.setId(user.getId());
		u.setFirstName(user.getFirstName());		
		u.setLastName(user.getLastName());
		u.setBornDate(user.getBornDate());
		return u;
	}

}
