package com.example.gift_memory_app;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository
        extends JpaRepository<Person, Long> {

    List<Person> findByUserId(Long userId);

    Optional<Person> findByIdAndUserId(
            Long id, Long userId);
}
