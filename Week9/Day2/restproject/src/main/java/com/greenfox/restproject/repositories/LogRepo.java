package com.greenfox.restproject.repositories;

import com.greenfox.restproject.model.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepo extends CrudRepository<Log, Long> {
}
