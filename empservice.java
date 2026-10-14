package com.example.modelmap;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class empservice {

    private final emprepository repository;
    private final ModelMapper modelMapper;

    public empservice(
            emprepository repository,
            ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public empDTO getEmployee(int id) {

        empentity e = repository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Employee not found"));

        return modelMapper.map(e, empDTO.class);
    }
}

