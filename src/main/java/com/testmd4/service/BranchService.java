package com.testmd4.service;

import com.testmd4.model.Branch;
import com.testmd4.repositories.IBranch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchService {
    @Autowired
    IBranch iBranch;

    public List<Branch> getAll() {
        return (List<Branch>) iBranch.findAll();
    }

    public Branch findById(int id) {
        Optional<Branch> optional = iBranch.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return new Branch();
    }
}
