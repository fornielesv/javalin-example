import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World"));
        app.get("/holaValeria", ctx -> ctx.result(decirNombre("valeria")));
        //mult - div- rest - sum >> acc por GET >> Recibir 2 parametros y hacer op.
        //A tener em cuenta: *ALTA cohesion, BAJO acoplamiento * diseño *validaciones *errores  

    }

    public static String decirNombre(String nombre){
        return "Hola "+nombre;
    }
}