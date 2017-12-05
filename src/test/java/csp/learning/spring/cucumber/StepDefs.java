package csp.learning.spring.cucumber;

import csp.learning.spring.cucumber.components.FakeComponent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.fr.Etantdonné;
import cucumber.api.java.fr.Lorsqu;
import cucumber.api.java.fr.Lorsque;
import cucumber.api.java.fr.Quand;

public class StepDefs extends AbstractStepDefs {
    private final FakeComponent fakeComponent;

    public StepDefs(FakeComponent fakeComponent) {
        this.fakeComponent = fakeComponent;
    }

    @Given("^Jeff has bought a microwave for \\$(\\d+)$")
    public void bought_a_microwabe(int arg1) {
        System.out.println("$" + arg1 + fakeComponent.value());
    }

    @When("^he returns the microwave$")
    public void returns_the_microwave() {
        System.out.println("Returns the microwave $" + fakeComponent.value());

    }

    @Then("^Jeff should be refunded \\$(\\d+)$")
    public void should_be_refunded(int arg1) {
        System.out.println("Refund $" + arg1);
    }

}
