package com.example.dxc.springdatajpa.service;


import com.example.dxc.springdatajpa.model.User;
import com.example.dxc.springdatajpa.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Iterable<User> getUsers() {
    log.info("Getting all users");
    return userRepository.findAll();
  }

  public User getUser(Integer id) {
    log.info("Getting user by id {}", id);
    return userRepository.findById(id).orElseThrow(() -> {
      return new RuntimeException(String.format("User=[%s] was not found", id));
    });
  }

  public User delete(Integer id) {
    log.info("Deleting user by id {}", id);
    User user = userRepository.findById(id).orElseThrow(() -> {
      return new RuntimeException(String.format("User=[%s] was not found", id));
    });
    userRepository.deleteById(id);
    return user;
  }

  public User createUser(String name, String email) {
    User user = User.builder().name(name).email(email).build();
    log.info("Creating {}", user);
    return userRepository.save(user);
  }

  public User updateUser(Integer id, String name, String email) {
    log.info("Updating user by id {}", id);
    User user = userRepository.findById(id).orElseThrow(() -> {
      return new RuntimeException(String.format("User=[%s] was not found", id));
    });

    if (name != null) {
      user.setName(name);
    }

    if (email != null) {
      user.setEmail(email);
    }

    userRepository.save(user);
    return user;
  }

}