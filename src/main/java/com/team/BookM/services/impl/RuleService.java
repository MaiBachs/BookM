package com.team.BookM.services.impl;

import com.team.BookM.entity.RuleEntity;
import com.team.BookM.repository.RuleRepo;
import com.team.BookM.services.IRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleService implements IRuleService {
    @Autowired
    private RuleRepo ruleRepo;
    @Override
    public List<RuleEntity> findAll() {
        return ruleRepo.findAll();
    }
}
