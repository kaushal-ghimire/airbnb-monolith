package com.airbnb.airbnb_monolith.repository;


import com.airbnb.airbnb_monolith.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}

