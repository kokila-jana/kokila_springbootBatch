
package com.example.gift_memory_app;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GiftController {

    private final GiftIdeaRepository giftIdeaRepository;
    private final UserRepository userRepository;

    public GiftController(GiftIdeaRepository giftIdeaRepository,
                          UserRepository userRepository) {
        this.giftIdeaRepository = giftIdeaRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/gifts")
    public String listGifts(Model model, Principal principal) {

        AppUser user = userRepository.findByEmail(principal.getName())
                .orElseThrow(() -> new RuntimeException("User not found"));

        List<GiftIdea> gifts =
                giftIdeaRepository.findByPerson_User_Id(user.getId());

        model.addAttribute("gifts", gifts);

        return "list2";
    }
}
 	