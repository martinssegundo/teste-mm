package br.com.skeleton.service;

import br.com.skeleton.repositories.entities.PersonEntity;

import java.util.List;

public interface PersonService {

    PersonEntity save(PersonEntity personEntity);
    PersonEntity findById(Long personId);
    List<PersonEntity> findByAge(Long age);

}
