package com.example.Laborator11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping
    public List<Person> list() {
        return service.listAll();
    }

    @PostMapping
    public void add(@RequestBody Person person) {
        service.save(person);
    }
}
