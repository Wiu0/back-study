package com.wiu.sss.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_sys")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(length = 15)
	private String firstName;
	@Column(length = 15)
	private String lastName;
	//@Column
	//private Date   bornDate;
}
