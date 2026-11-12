
package com.example.gift_memory_app;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GiftIdeaRepository
        extends JpaRepository<GiftIdea, Long> {

    List<GiftIdea> findByPerson_User_Id(Long userId);

}
