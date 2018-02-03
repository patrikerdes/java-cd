package se.patrikerdes.hello;

import spark.Service;

public class HelloWorld {
    private static Service http;

    public static void main(String[] args) {
        int port;
        if(args.length == 1) {
            port = Integer.parseInt(args[0]);
        } else {
            port = Integer.parseInt(System.getenv("PORT"));
        }
        start(port);
    }

    public static void start(int port) {
        http = Service.ignite();
        http.port(port);
        http.get("/", (req, res) -> {
            res.type("application/json");
            return "{\"message\":\"Hello World!\"}";
        });
    }

    public static void stop() {
        http.stop();
    }
}
