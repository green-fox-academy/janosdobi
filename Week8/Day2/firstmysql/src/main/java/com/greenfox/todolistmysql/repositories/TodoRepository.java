package com.greenfox.todolistmysql.repositories;

import com.greenfox.todolistmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findByTitle(String title);

    List<Todo> findByAssignee(String name);

}
