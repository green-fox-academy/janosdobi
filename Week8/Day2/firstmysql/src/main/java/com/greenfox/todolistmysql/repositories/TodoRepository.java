package com.greenfox.todolistmysql.repositories;

import com.greenfox.todolistmysql.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    @Query(value = "SELECT * FROM todo WHERE done = 'false'", nativeQuery = true)
    List<Todo> findAllActive();

    List<Todo> findAllByTitle(String title);
}