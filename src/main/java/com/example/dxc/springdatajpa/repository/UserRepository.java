package com.example.dxc.springdatajpa.repository;

import com.example.dxc.springdatajpa.model.User;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
// Norberto Enomoto
public interface UserRepository extends CrudRepository<User, Integer> {

}