package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.crud.dtos.UserDto;
import com.example.crud.models.UserModel;
import com.example.crud.repository.UserRepository;

@Service
public interface UserService {

    
    public List<UserModel> acharTodos();
    
    public Optional<UserModel>  detalhar(Long id);
    public UserDto create(UserDto userDto);
    public UserDto update( Long id,UserDto userDto);
    public UserDto  delete(Long id);
}
