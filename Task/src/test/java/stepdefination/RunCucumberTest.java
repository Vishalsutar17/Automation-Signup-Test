package stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
    features = "classpath:Features/SignUp.feature",              
    glue = "stepdefination",                                           
    plugin = {"pretty", "html:target/cucumber-reports.html"},          
    monochrome = true,                                                
    tags ="@SignUp"
)
public class RunCucumberTest{

}
