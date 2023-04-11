package com.team.BookM.entity;

import javax.persistence.*;

@Entity
@Table(name = "Rule")
public class RuleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String ruleName;
    @Column
    private String ruleDesciption;
    @Column
    private Boolean status;

    public RuleEntity() {
    }

    public RuleEntity(Long id, String ruleName, String ruleDesciption, Boolean status) {
        this.id = id;
        this.ruleName = ruleName;
        this.ruleDesciption = ruleDesciption;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleDesciption() {
        return ruleDesciption;
    }

    public void setRuleDesciption(String ruleDesciption) {
        this.ruleDesciption = ruleDesciption;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
