package com.codurance.acceptancetests;

import com.codurance.StatementLine;
import cucumber.api.Format;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Date;
import java.util.List;

public class PrintStatementSteps {
    @Given("^a client makes a deposit of (\\d+) on (\\d{2}/\\d{2}/\\d{4})$")
    public void aClientMakesADepositOfOn(int value, @Format("dd/MM/yyyy") Date date) throws Throwable {
        throw new PendingException();
    }

    @And("^a deposit of (\\d+) on (.+)$")
    public void aDepositOfOn(int amount, String date) throws Throwable {
        throw new PendingException();
    }

    @And("^a withdrawal of (\\d+) on (.+)$")
    public void aWithdrawalOfOn(int amount, String date) throws Throwable {
        throw new PendingException();
    }

    @When("^she prints her bank statement$")
    public void shePrintsHerBankStatement() throws Throwable {
        throw new PendingException();
    }

    @Then("^she would see$")
    public void sheWouldSee(List<StatementLine> bankStatement) throws Throwable {
        throw new PendingException();
    }
}