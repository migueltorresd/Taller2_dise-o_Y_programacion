
import java.io.IOException;
import java.util.Scanner;



public class Main {

     private static boolean bandera = true;
     private static int opcion;

     public static void main(String[] args) throws IOException {


          do {
               limpiarPantalla();
               menu();
               opcion = capturarOpcion();
               bandera = evaluarOpcion(opcion);
          } while (bandera == true);
     }

     private static void menu() {
          System.out.println("------- Crea tu nave espacial ------- ");
          System.out.println("Seleccione que tipo de nave necesitas");
          System.out.println("1. nave vehiculos lanzadera");
          System.out.println("2. nave no tripulada");
          System.out.println("3. nave planetas");
          System.out.println("4. nave tripuladas");


     }

     private static int capturarOpcion() {
          Scanner input = new Scanner(System.in);
          return input.nextInt();
     }

     private static boolean evaluarOpcion(int opcion) throws IOException {
          switch (opcion) {
               case 1:
                    String[] args = new String[0];
                    Vehiculo_lanzedera.Main.main(args);
                    return true;

               case 0:
                    return false;
               // break;
               default:
                    System.out.println("Opción incorrecta");
                    System.in.read();

          }
          return true;
     }

     private static void limpiarPantalla() {
          System.out.print("\033[H\033[2J");
          System.out.flush();
     }


}
