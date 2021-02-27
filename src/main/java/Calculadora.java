import io.javalin.Javalin;

public class Calculadora {
        public static void main(String[] args) {
            Javalin app = Javalin.create().start(7000);
            app.get("/calculadora/suma", request -> request.result(Integer.toString(suma(Integer.parseInt(request.queryParam("numero1")),Integer.parseInt(request.queryParam("numero2"))))));
            app.get("/calculadora/resta", request -> request.result(Integer.toString(resta(Integer.parseInt(request.queryParam("numero1")),Integer.parseInt(request.queryParam("numero2"))))));
            app.get("/calculadora/division", request -> request.result(Float.toString(division(Integer.parseInt(request.queryParam("numero1")),Integer.parseInt(request.queryParam("numero2"))))));
            app.get("/calculadora/multiplicacion", request -> request.result(Integer.toString(multiplicacion(Integer.parseInt(request.queryParam("numero1")),Integer.parseInt(request.queryParam("numero2"))))));
        }

        private static int suma(int numero1, int numero2) {

            return (numero1 + numero2);
        }

        private static int resta(int numero1, int numero2) {

            return (numero1 - numero2);
        }

        private static float division(int numero1, int numero2) throws Exception {
            if(numero2!=0){
                return (numero1 / numero2);
            } else {
                throw new Exception ("No se puede dividir por cero.");
            }
        }

        private static int multiplicacion(int numero1, int numero2) {
            return (numero1 * numero2);
        }

}
