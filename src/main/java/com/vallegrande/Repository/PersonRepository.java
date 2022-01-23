package com.vallegrande.Repository;


import com.vallegrande.Entity.Person;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Singleton
public class PersonRepository {

    @Inject
    EntityManager entityManager;

    public List getPersons() {
        return entityManager.createQuery("SELECT p FROM Person p").getResultList();
    }

    public Person getPerson(int idPerson) {
        return entityManager.find(Person.class, idPerson);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public Person addPerson(Person person) {
        entityManager.persist(person);
        return person;
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void updatePerson(int idPerson, Person person) {
        Person personToUpdate = entityManager.find(Person.class, idPerson);
        if (null != personToUpdate) {
            personToUpdate.setNamePerson(person.getNamePerson());
            personToUpdate.setLastnamePerson(person.getLastnamePerson());
            personToUpdate.setDniPerson(person.getDniPerson());
        } else {
            throw new RuntimeException("No se pudo realizar la actualizacion a " + idPerson);
        }
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public void deletePerson(int idPerson) {
        Person person = getPerson(idPerson);
        entityManager.remove(person);

    }
}
