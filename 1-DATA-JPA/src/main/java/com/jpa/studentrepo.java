package com.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface studentrepo extends CrudRepository<Student1, Integer> {

}
