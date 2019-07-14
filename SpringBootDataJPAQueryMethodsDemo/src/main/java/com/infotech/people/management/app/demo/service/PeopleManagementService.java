package com.infotech.people.management.app.demo.service;

import com.infotech.people.management.app.demo.dao.PeopleManagementDao;
import com.infotech.people.management.app.demo.entities.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleManagementService {

    private final PeopleManagementDao peopleManagementDao;


    public PeopleManagementService(PeopleManagementDao peopleManagementDao) {
        this.peopleManagementDao = peopleManagementDao;
    }

    public List<Person> getPersonsInfoByLastName(String lastName) {
        return peopleManagementDao.findByLastName(lastName);
    }

    public List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email) {
         return peopleManagementDao.findByFirstNameAndEmail(firstName, email);
    }
}
