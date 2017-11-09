package com.greenfox.guardians.service;

import com.greenfox.guardians.model.Guardian;
import com.greenfox.guardians.repositories.GuardianRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuardianService {

    @Autowired
    GuardianRepo guardianRepo;

    public void addNewGuardian(Guardian g) {
        guardianRepo.save(g);
    }

    public Iterable<Guardian> getAllGuardians() {
        return guardianRepo.findAll();
    }

    public void deleteGuardian(Long id) {
        guardianRepo.delete(id);
    }
}