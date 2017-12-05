package csp.learning.spring.cucumber;

import csp.learning.spring.cucumber.components.FakeComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCucumberApplication implements CommandLineRunner {

	@Autowired
	private FakeComponent fakeComponent;

	public static void main(String[] args) {
		SpringApplication.run(SpringCucumberApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {
		System.out.println("HERE !");
	}
}
