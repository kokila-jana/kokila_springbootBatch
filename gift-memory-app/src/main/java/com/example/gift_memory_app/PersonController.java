package com.example.gift_memory_app;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    private final PersonRepository personRepository;
    private final UserRepository userRepository;

    public PersonController(PersonRepository personRepository,
                            UserRepository userRepository) {
        this.personRepository = personRepository;
        this.userRepository = userRepository;
    }

    // Display all people
    @GetMapping("/persons")
    public String listPersons(Model model, Principal principal) {

        AppUser user = userRepository.findByEmail(principal.getName())
                .orElseThrow(() -> new RuntimeException("User not found"));

        List<Person> persons =
                personRepository.findByUserId(user.getId());

        model.addAttribute("persons", persons);

        return "persons/list";
    }

    // Open Add Person page
    @GetMapping("/persons/add")
    public String showAddPersonForm(Model model) {

        model.addAttribute("person", new Person());

        return "persons/add";
    }

    // Save Person
    @PostMapping("/persons/save")
    public String savePerson(
            @ModelAttribute("person") Person person,
            Principal principal) {

        AppUser user = userRepository.findByEmail(principal.getName())
                .orElseThrow(() -> new RuntimeException("User not found"));

        person.setUser(user);

        personRepository.save(person);

        return "redirect:/persons";
    }
}