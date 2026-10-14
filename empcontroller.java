package com.example.modelmap;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class empcontroller {

    private final empservice service;

    public empcontroller(empservice service) {
        this.service = service;
    }

    @GetMapping("/employee/{id}")
    public empDTO getEmployee(@PathVariable int id) {
        return service.getEmployee(id);
    }
}
