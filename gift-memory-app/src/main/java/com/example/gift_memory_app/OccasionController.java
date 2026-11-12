package com.example.gift_memory_app;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OccasionController {

    private final OccasionRepository occasionRepository;
    private final UserRepository userRepository;

    public OccasionController(OccasionRepository occasionRepository,
                              UserRepository userRepository) {
        this.occasionRepository = occasionRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/occasions")
    public String listOccasions(Model model, Principal principal) {

        AppUser user = userRepository.findByEmail(principal.getName())
                .orElseThrow(() -> new RuntimeException("User not found"));

        List<Occasion> occasions =
                occasionRepository.findByPersonUserId(user.getId());

        model.addAttribute("occasions", occasions);

        return "list1";
    }
}
