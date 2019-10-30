package com.github.darioajr.dmn.app;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.DecisionService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;

@ProcessApplication("Tabela de Decisão de Percentual de Resgate")
public class App extends ServletProcessApplication {

    @PostDeploy
    public void evaluateDecisionTable(ProcessEngine processEngine) {

        DecisionService decisionService = processEngine.getDecisionService();
        
        VariableMap variables = Variables.createVariables()
            .putValue("plano", "VGBL")
            .putValue("contribuicao", 10)
            .putValue("valor", false);
        
        DmnDecisionTableResult resgateDecisionResult = decisionService.evaluateDecisionTableByKey("resgate", variables);

        String valorResgate = resgateDecisionResult.getSingleEntry();

        System.out.println("Percentual do Resgate: " + valorResgate);
    }
}