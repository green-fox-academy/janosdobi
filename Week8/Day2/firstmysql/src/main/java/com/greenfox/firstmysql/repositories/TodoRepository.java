package com.greenfox.firstmysql.repositories;

import com.greenfox.firstmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
