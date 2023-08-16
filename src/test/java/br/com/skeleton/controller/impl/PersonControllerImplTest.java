package br.com.skeleton.controller.impl;

import br.com.skeleton.controller.entities.response.PersonResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

class PersonControllerImplTest {
    PersonControllerImpl personControllerImpl = new PersonControllerImpl();

    @Test
    void testSave() {
        ResponseEntity<PersonResponse> result = personControllerImpl.save(null);
        Assertions.assertEquals(null, result);
    }

    @Test
    void testFindById() {
        ResponseEntity<PersonResponse> result = personControllerImpl.findById(Long.valueOf(1));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testFindByAge() {
        ResponseEntity result = personControllerImpl.findByAge(Long.valueOf(1));
        Assertions.assertEquals(null, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme