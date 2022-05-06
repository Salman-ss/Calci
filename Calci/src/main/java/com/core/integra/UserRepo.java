package com.core.integra;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel1,Integer> {
    @Override
	List<UserModel1> findAll();

}
