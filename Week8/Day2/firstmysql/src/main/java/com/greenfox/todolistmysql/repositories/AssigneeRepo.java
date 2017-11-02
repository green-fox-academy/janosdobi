package com.greenfox.todolistmysql.repositories;

import com.greenfox.todolistmysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepo extends CrudRepository<Assignee, Long>{
}
