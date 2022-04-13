package Manned_spacecraft;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    private static boolean bandera = true;
    private static int opcion;

    /**
     * creamos la clase principal donde vamos a correr
     * todo nuestro codigo para esto creo un ciclo do while el cual va a contener algunos
     * metodos necesarios para esta parte del proyecto
     *
     * @param args
     * @throws IOException
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
     * a continuacion se crean los diferentes metodos que necesitamos para correr nuestro codigo
     * por ejemplo el menu que se impreme en pantalla, la captura de la opcion del usuario y el switch para la
     * ejecucion del programa
     */

    private static void menu() {
        System.out.println("***------- NAVES ESPACIALES TRIPULADAS / MANNED SPACECRAFT-------*** ");
        System.out.println("-Informacion importante: " + "\n" + "Resulta meridiano que su propósito consiste en mandar" + "\n" + "seres humanos al espacio para diferentes tareas.");
        System.out.println("\n" + "-Important information: " + "\n" + "It is clear that their purpose is to send human" + "\n" + "beings into space for different tasks.");
        System.out.println("\n" + "Seleccione la Nave de su preferencia / Select the ship of your choice");
        System.out.println("Viajes a ala luna / Trips to the moon");
        System.out.println("1. Nave Americana / American ship");
        System.out.println("2. Nave Rusa / Russian Ship" + "\n");
        System.out.println("Naves de experimentacion / Experimental vessels");
        System.out.println("3. Nave Americana / American ship");
        System.out.println("4. Nave Rusa / Russian Ship" + "\n");
        System.out.println("Vehiculos de carga / cargo vehicle");
        System.out.println("5. Nave Americana / American ship");
        System.out.println("6. Nave Rusa / Russian Ship");
        System.out.println("0. Elegir otro tipo de Nave / Choose another type of vessel");
    }

    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        model_ship[] model_ships1 = new model_ship[6];
        model_ships1[0] = new moon_missions("Apolo", "inactivo");
        model_ships1[1] = new moon_missions("Soyuz", "activo");
        model_ships1[2] = new experimentation("EEI (Estacion Espacial Internacional) ", " en la actualidad se encuentra :activa");
        model_ships1[3] = new experimentation("Estacion Espacial Rusa", " en la actualidad se encuentra : destruida");
        model_ships1[4] = new cargo_vehicle("Dragon V2 ", " en la actualidad se encuentra :activa", "2016 - Actualidad");
        model_ships1[5] = new cargo_vehicle("Vostok", " en la actualidad se encuentra : destruida", "1964 - 1965");


        switch (opcion) {
            case 1:
                System.out.println(model_ships1[0].ship1());
                System.out.println(model_ships1[0].year_of_activity("1966-1975") + "\n" + model_ships1[0].country_of_manufacture("EEUU"));

                return true;
            case 2:
                System.out.println(model_ships1[1].ship1());
                System.out.println(model_ships1[1].year_of_activity("1967-Actualidad") + "\n" + model_ships1[0].country_of_manufacture("RUSIA"));
                return true;

            case 3:
                System.out.println(model_ships1[2].ship1());

                return true;
            case 4:
                System.out.println(model_ships1[3].ship1());
                return true;
            case 5:
                System.out.println(model_ships1[4].ship1());
                System.out.println("\n" + model_ships1[0].country_of_manufacture("EEUU"));

                return true;
            case 6:
                System.out.println(model_ships1[5].ship1());
                System.out.println("\n" + model_ships1[0].country_of_manufacture("RUSIA"));
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




