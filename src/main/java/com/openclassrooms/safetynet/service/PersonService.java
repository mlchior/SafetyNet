package com.openclassrooms.safetynet.service;

import java.util.Optional;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.safetynet.model.Person;
import com.openclassrooms.safetynet.repository.PersonRepository;



@Data
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Optional<Person> getPersonById(final Long id) {
        return personRepository.findById(id); }
    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();}
    public void deletePerson(final Long id) {
        personRepository.deleteById(id);}
    public Person savePerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return savedPerson;}


    public Person updatePerson(Person person, Long id) {
        Person personToUpdate = personRepository.findById(id).get();
        personToUpdate.setFirstName(person.getFirstName());
        personToUpdate.setLastName(person.getLastName());
        personToUpdate.setAddress(person.getAddress());
        personToUpdate.setPhone(person.getPhone());
        personToUpdate.setEmail(person.getEmail());
        personToUpdate.setCity(person.getCity());
        personToUpdate.setZipCode(person.getZipCode());
        personToUpdate.setId(person.getId());
        return personRepository.save(personToUpdate);
    }
}
