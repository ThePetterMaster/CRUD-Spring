package com.example.crud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.models.UserModel;

@SuppressWarnings("unused")
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
