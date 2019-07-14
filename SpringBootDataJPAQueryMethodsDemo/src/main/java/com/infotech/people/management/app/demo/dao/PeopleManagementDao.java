package com.infotech.people.management.app.demo.dao;

import com.infotech.people.management.app.demo.entities.Person;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PeopleManagementDao extends Repository<Person, Integer> {
    List<Person> findByLastName(String lastName);
    List<Person> findByFirstNameAndEmail(String firstName, String email);
}
