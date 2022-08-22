package kus.krzysztof.repository;

import org.springframework.data.repository.CrudRepository;

import kus.krzysztof.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{

}