package csp.learning.spring.cucumber.components;

import org.springframework.stereotype.Component;

@Component
public class FakeComponent {

    public int value() {
        return 10;
    }
}
