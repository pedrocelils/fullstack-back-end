 package com.pedro.celio.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.celio.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
