package se.patrikerdes.hello;

import org.junit.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class HelloWorldTest {

    @BeforeClass
    public static void startUp() {
        HelloWorld.start(8080);
    }

    @AfterClass
    public static void shutDown() {
        HelloWorld.stop();
    }

    @Test
    public void testRoot() {
        when().get("/").then().
                statusCode(200).
                body("message", equalTo("Hello world!")).
                contentType("application/json");
    }
}
