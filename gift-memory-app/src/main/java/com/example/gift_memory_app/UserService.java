package com.example.gift_memory_app;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserService(
            UserRepository repository,
            PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public void register(AppUser user) {

        if (repository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException(
                "Email already registered");
        }

        user.setEmail(user.getEmail().trim().toLowerCase());
        user.setPassword(
            passwordEncoder.encode(user.getPassword()));

        repository.save(user);
    }
}