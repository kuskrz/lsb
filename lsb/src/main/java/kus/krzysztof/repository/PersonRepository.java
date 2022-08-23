package kus.krzysztof.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import kus.krzysztof.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
	Optional<Person> findById(Long id);
}