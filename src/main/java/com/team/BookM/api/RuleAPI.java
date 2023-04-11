package com.team.BookM.api;

import com.team.BookM.entity.RuleEntity;
import com.team.BookM.services.IRuleService;
import com.team.BookM.services.impl.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RuleAPI {
    @Autowired
    private IRuleService ruleService;
    @GetMapping(value = "/findAllRule")
    List<RuleEntity> findAll(){
        return ruleService.findAll();
    }
}
