package se.patrikerdes.hello;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class HelloWorldTest {
    final static HelloWorld helloWorld = new HelloWorld();

    @Test
    public void testRoot() {
        helloWorld.main(new String[]{"8080"});
        when().get("/").then().
                statusCode(200).
                body("message", equalTo("Hello world!")).
                contentType("application/json");
    }
}
