package com.wiu.sss.dto.user;

import java.sql.Date;

import lombok.Data;

@Data
public class UserDTO {

	private long id;
	private String firstName;
	private String lastName;
	private Date   bornDate;
}
