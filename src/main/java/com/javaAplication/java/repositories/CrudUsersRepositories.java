package com.javaAplication.java.repositories;

import com.javaAplication.java.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository

public interface CrudUsersRepositories extends JpaRepository<UserModel, Long> {

}