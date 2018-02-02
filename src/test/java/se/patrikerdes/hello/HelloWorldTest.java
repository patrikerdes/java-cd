package se.patrikerdes.hello;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HelloWorldTest {
    final static HelloWorld helloWorld = new HelloWorld();

    @Test
    void testRoot() {
        helloWorld.main(new String[]{"8080"});
        when().get("/").then().
                statusCode(200).
                body("message", equalTo("Hello world!")).
                contentType("application/json");
    }
}
