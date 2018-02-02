package se.patrikerdes.hello;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        if(args.length == 1) {
            port(Integer.parseInt(args[0]));
        } else {
            port(Integer.parseInt(System.getenv("PORT")));
        }
        get("/", (req, res) -> {
            res.type("application/json");
            return "{\"message\":\"Hello world!\"}";
        });
    }
}
