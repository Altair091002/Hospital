package com.hospital.isd3project.repos;

import com.hospital.isd3project.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepos extends JpaRepository<Person, Integer> {
}
