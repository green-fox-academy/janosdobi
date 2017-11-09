package com.greenfox.guardians.repositories;

import com.greenfox.guardians.model.Guardian;
import org.springframework.data.repository.CrudRepository;

public interface GuardianRepo extends CrudRepository<Guardian, Long> {
}
