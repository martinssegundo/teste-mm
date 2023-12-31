package br.com.skeleton.service.impl;

import br.com.skeleton.repositories.entities.PersonEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith({MockitoExtension.class})
class PerosonServiceImplTest {
    PerosonServiceImpl perosonServiceImpl = new PerosonServiceImpl();

    @Test
    void testSave() {
        PersonEntity result = perosonServiceImpl.save(null);
        Assertions.assertEquals(null, result);
    }

    @Test
    void testFindById() {
        PersonEntity result = perosonServiceImpl.findById(Long.valueOf(1));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testFindByAge() {
        List<PersonEntity> result = perosonServiceImpl.findByAge(Long.valueOf(1));
        Assertions.assertEquals(List.of(null), result);
    }
}

