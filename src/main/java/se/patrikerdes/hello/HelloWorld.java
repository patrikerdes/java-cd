package se.patrikerdes.hello;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        port(Integer.parseInt(System.getenv("PORT")));
        get("/", (req, res) -> "Hello world!");
    }
}
