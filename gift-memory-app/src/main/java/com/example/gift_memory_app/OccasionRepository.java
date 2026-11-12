package com.example.gift_memory_app;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OccasionRepository
        extends JpaRepository<Occasion, Long> {

    List<Occasion> findByPersonUserId(Long userId);
}
