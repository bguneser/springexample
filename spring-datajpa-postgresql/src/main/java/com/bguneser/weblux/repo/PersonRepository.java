package com.bguneser.weblux.repo;

import com.bguneser.weblux.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
