package com.wiu.sss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiu.sss.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
