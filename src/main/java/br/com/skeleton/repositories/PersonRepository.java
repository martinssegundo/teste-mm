package br.com.skeleton.repositories;

import br.com.skeleton.repositories.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Long, PersonEntity> {

    public List<PersonEntity> findByAge(Long age);
}
