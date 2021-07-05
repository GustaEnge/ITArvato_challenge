package cucumber.steps;

import base.BankAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Scanner;

public class verifyBankAccountSteps {
    public verifyBankAccountSteps() {}
    @Given("^the bank account validation request with a valid IBAN and valid authentication token$")
    public void verifyBank(){
        Scanner scan = new Scanner(System.in);
        BankAccount user = new BankAccount();
        System.out.println("IBAN:\n");
        String iban_account = scan.next();
        System.out.println("Token:\n");
        String token = scan.next();

        user.setAccount(iban_account);
        user.setAuthToken(token);



    }

    @When("bank account validation request is sent to the server")
    public void bankAccountValidationRequestIsSentToTheServer() {
        
    }

    @Then("server responds with HTTP response code {int}")
    public void serverRespondsWithHTTPResponseCode(int arg0) {
        
    }

    @And("response body contains isValid = true")
    public void responseBodyContainsIsValidTrue() {
        
    }

    @Given("the bank account validation request without a JWT token")
    public void theBankAccountValidationRequestWithoutAJWTToken() {
        
    }

    @When("sample request is sent to the server")
    public void sampleRequestIsSentToTheServer() {

    }

    @And("response body contains {string}")
    public void responseBodyContains(String arg0) {
    }
}
