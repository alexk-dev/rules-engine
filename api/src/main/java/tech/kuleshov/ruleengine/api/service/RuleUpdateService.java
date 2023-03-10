package tech.kuleshov.ruleengine.api.service;

import org.springframework.stereotype.Service;
import tech.kuleshov.ruleengine.api.dao.RuleRepository;
import tech.kuleshov.ruleengine.base.RuleDefinition;

@Service
public class RuleUpdateService {

  private final RuleRepository ruleRepository;

  public RuleUpdateService(RuleRepository ruleRepository) {
    this.ruleRepository = ruleRepository;
  }

  public void updateRule(RuleDefinition rd) {
    // todo: checks
    ruleRepository.save(rd.getWorkflowId(), rd);
  }
}
