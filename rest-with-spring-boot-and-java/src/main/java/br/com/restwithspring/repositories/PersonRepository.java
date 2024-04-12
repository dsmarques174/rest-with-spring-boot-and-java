package br.com.restwithspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restwithspring.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
