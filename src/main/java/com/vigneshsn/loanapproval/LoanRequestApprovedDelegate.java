package com.vigneshsn.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("loanRequestApprovedDelegate")
public class LoanRequestApprovedDelegate implements JavaDelegate {
    Logger log = LoggerFactory.getLogger(getClass().getName());
    @Override
    public void execute(DelegateExecution delegateExecution) {
        String loanId = (String) delegateExecution.getVariable("loan_id");
        log.info("The loanRequestApprovedDelegate is approved {} {} {}", delegateExecution.getId(),
                loanId);
    }
}
