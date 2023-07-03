package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",//features folder path
        glue = "stepdefinitions", //stepdefinitions path
        tags = "@google_search"
)

public class Runner {
}
//Bu sınıf test caseleri RUN etmek için kullanılır
//Ve konfigürasyonlar için kullanılır.
//runner class, features file lar ile stepdefinitons ı birbirlerine baglar.
