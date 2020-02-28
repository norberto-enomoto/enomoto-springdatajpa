package com.example.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springdatajpa.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
// Norberto Enomoto
public interface UserRepository extends CrudRepository<User, Integer> {

}