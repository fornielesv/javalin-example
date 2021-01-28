import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World"));
        app.get("/holaValeria", ctx -> ctx.result(decirNombre("valeria")));
    }

    public static String decirNombre(String nombre){
        return "Hola "+nombre;
    }
}