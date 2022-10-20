package com.hospital.isd3project.controllers;

import com.hospital.isd3project.dto.PersonAuthDTO;
import com.hospital.isd3project.models.Person;
import com.hospital.isd3project.services.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class AuthController {
    private final PersonService personService;
    private final ModelMapper modelMapper;

    @Autowired
    public AuthController(PersonService personService, ModelMapper modelMapper) {
        this.personService = personService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/login")
    public String loginPage(){
        return "auth/login";
    }

    @ResponseBody
    @PostMapping("/registration")
    public String registration(@RequestBody PersonAuthDTO personDTO){
        try{
            personService.register(modelMapper.map(personDTO, Person.class));
            return "successful";
        } catch (Exception e) {
            return "something is wrong";
        }
    }

    @ResponseBody
    @PostMapping("/login")
    public Person login(@RequestBody PersonAuthDTO personDTO){
        Person person = personService.findByUsername(personDTO.getUsername());
        if(personService.checkPassword(person, personDTO.getPassword())){
            return person;
        }
        else return null;
    }
}
