package com.hospital.isd3project.services;

import com.hospital.isd3project.models.Person;
import com.hospital.isd3project.repos.PeopleRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PersonService {
    private final PeopleRepo peopleRepo;

    public PersonService(PeopleRepo peopleRepo) {
        this.peopleRepo = peopleRepo;
    }

    @Transactional
    public void register(Person person){
        peopleRepo.save(person);
    }

    public Person findByUsername(String username){
        Optional<Person> person  = peopleRepo.findByUsername(username);
        if (person.isEmpty())
            return null;
        return person.get();
    }

    public boolean checkPassword(Person person, String password){
        return person.getPassword().equals(password);
    }
}
