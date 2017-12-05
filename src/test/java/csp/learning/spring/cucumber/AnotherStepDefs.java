package csp.learning.spring.cucumber;

import csp.learning.spring.cucumber.components.FakeComponent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AnotherStepDefs extends AbstractStepDefs {
    private final FakeComponent fakeComponent;

    public AnotherStepDefs(FakeComponent fakeComponent) {
        this.fakeComponent = fakeComponent;
    }

    @Given("^Jeff wants a microwave")
    public void want_a_microwabe() {
        System.out.println("Want a microwave");
    }

    @Then("^he should pay \\$(\\d+)$")
    public void should_pay(int arg1) {
        System.out.println("Payment $" + arg1 + fakeComponent.value());
    }

}
