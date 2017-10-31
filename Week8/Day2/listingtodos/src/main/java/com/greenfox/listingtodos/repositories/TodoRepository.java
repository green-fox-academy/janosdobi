package com.greenfox.listingtodos.repositories;

import com.greenfox.listingtodos.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
