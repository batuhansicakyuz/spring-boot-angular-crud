package com.example.springbootcrud.service;

import com.example.springbootcrud.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {

    public User addUser(User user);

    public List<User> getUsers();

    List<User> getUser();

    public User getUserByid(int id);

    public User updateUser(int id , User user);

    public void deleteUser(int id);

}
