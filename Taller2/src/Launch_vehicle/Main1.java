package Launch_vehicle;
/**
 * importamos las librerias necesarias para la ejecucion de nuestro codigo
 */

import java.io.IOException;
import java.util.Scanner;

/**
 * declaramos los atributos necesarios
 */
public class Main1 {
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
        System.out.println("***------- VEHÍCULOS LANZADERA / LANZERA VEHICLE-------*** ");
        System.out.println("-Informacion importante: " + "\n" + "Como su propio nombre indica, se trata de un cohete autopropulsado que sirve" + "\n" + "para lanzar una carga útil al espacio, normalmente un satélite artificial, una sonda" + "\n" + "o una nave tripulada.");
        System.out.println("\n" + "-Important information: " + "\n" + "As its name suggests, it is a self-propelled rocket used to launch a payload into" + "\n" + "space, usually an artificial satellite, a probe or a manned spacecraft.");
        System.out.println("\n" + "Seleccione la Nave de su preferencia / Select the ship of your choice");
        System.out.println("1. Nave Americana / American ship");
        System.out.println("2. Nave Rusa / Russian Ship");
        System.out.println("0. Elegir otro tipo de Nave / Choose another type of vessel");
    }

    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        spacecraft[] spacecrafts2 = new spacecraft[2];
        spacecrafts2[0] = new nave1("3500", "118", "2900", "100", "Saturno V", "EEUU");
        spacecrafts2[1] = new nave1("3060", "100", "2400", "100", "Energia", "rusia");


        switch (opcion) {
            case 1:
                System.out.println(spacecrafts2[0].ship());
                System.out.println("Especificaciones tecnicas: " + "\n" + spacecrafts2[0].specifications() + "\n");

                return true;
            case 2:
                System.out.println(spacecrafts2[1].ship());
                System.out.println("Especificaciones tecnicas: " + "\n" + spacecrafts2[1].specifications() + "\n");
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




