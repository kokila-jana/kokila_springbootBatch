package com.example.gift_memory_app;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GiftHistoryRepository
        extends JpaRepository<GiftHistory, Long> {

    List<GiftHistory> findByPersonUserId(Long userId);

    boolean existsByPersonIdAndGiftNameIgnoreCase(
            Long personId, String giftName);
}
