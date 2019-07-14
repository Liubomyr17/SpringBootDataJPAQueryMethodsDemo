package com.infotech.people.management.app.demo;

import com.infotech.people.management.app.demo.entities.Person;
import com.infotech.people.management.app.demo.service.PeopleManagementService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final PeopleManagementService peopleManagementService;

    public DemoApplication(PeopleManagementService peopleManagementService) {
        this.peopleManagementService = peopleManagementService;
    }

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // getPersonsInfoByLastName();
        getPersonsInfoByFirstNameAndEmail();
    }

    private void getPersonsInfoByFirstNameAndEmail() {
        List<Person> personList = peopleManagementService.getPersonsInfoByFirstNameAndEmail("Barry", "li1991@gmail.com");
        personList.forEach(System.out::println);
    }

    private void getPersonsInfoByLastName() {
        List<Person> personList = peopleManagementService.getPersonsInfoByLastName("Murphy");
        personList.forEach(System.out::println);
    }

}
