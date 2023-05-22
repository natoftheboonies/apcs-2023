import static spark.Spark.*;
import spark.*;

// http://sparkjava.com/documentation
public class HelloSpark {
    public static void main(String[] args) {

        // Configure Spark
        port(4567);
        staticFiles.location("/public");
        staticFiles.expireTime(600L);

        System.out.println("Hello, Spark!");
        get("/hello", (req, res) -> "Hello, Spark!");

        get("/hello/:name", HelloSpark.serveIndexPage);
    }

    public static Route serveIndexPage = (Request request, Response response) -> {
        return "Hello: " + request.params(":name");
    };

}