/**
 * author Miguel Angel Torres Diaz
 *para iniciar se importan los paquetes los cuales seras usados en el sigueinte menu
 */

import Launch_vehicle.Main1;
import Manned_spacecraft.Main2;
import No_tripulada.Main3;

import java.io.IOException;
import java.util.Scanner;

public class Main_Principal {
     private static boolean bandera = true;
     private static int opcion;

/**
 * se crea metodo principal donde se va a ejecutar todo el programa
 */
     public static void main(String[] args) throws IOException {


          do {
               limpiarPantalla();
               menu();
               opcion = capturarOpcion();
               bandera = evaluarOpcion(opcion);
          } while (bandera == true);
     }

     /**
      * se crea un metodo para crear el menu que va a visualizar el usuario
      */
     private static void menu() {
          System.out.println("------Listos para iniciar tu viaje a las estrellas / Ready to start your journey to the stars------- ");
          System.out.println("Seleccione que tipo de nave necesitas / Select the type of vessel you need");
          System.out.println("1. Nave vehiculos lanzadera / Shuttle vehicle shed");
          System.out.println("2. Nave no tripulada / Unmanned spacecraft");
          System.out.println("3. Nave tripuladas / Manned spacecraft");
          System.out.println("0. Salir del programa / Exit program");

     }

     /**
      * se crea un metodo donde vamos a capturar la opcion elegida por el usuario
      * @return
      */
     private static int capturarOpcion() {
          Scanner input = new Scanner(System.in);
          return input.nextInt();
     }

     /**
      * en este metodo evaluamos la opcion ya capturada del usuario se evalua gracias al switch que vemos a continuacion
      * @param opcion
      * @return
      * @throws IOException
      */
     private static boolean evaluarOpcion(int opcion) throws IOException {
          switch (opcion) {
               case 1:
                    String[] args = new String[0];
                    Main1.main(args);
                    return true;
               case 2:
                    String[] args1 = new String[0];
                    Main2.main(args1);
                    return true;
               case 3:
                    String[] args2 = new String[0];
                    Main3.main(args2);
                    return true;

               case 0:
                    return false;
               // break;
               default:
                    System.out.println("Opción incorrecta / incorrect option");
                    System.in.read();

          }
          return true;
     }

     private static void limpiarPantalla() {
          System.out.print("\033[H\033[2J");
          System.out.flush();
     }


}
