package No_tripulada;

import Launch_vehicle.nave1;
import Launch_vehicle.spacecraft;

import java.io.IOException;
import java.util.Scanner;

/**
 * declaramos los atributos necesarios
 */
public class Main3 {
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
        System.out.println("***------- Nave no Tripulada / Unmanned spacecraft-------*** ");
        System.out.println("-Informacion importante: " + "\n" + "Esta categoría resulta la más nutrida, pese a que no se incluyen aquí los" + "\n" + "numerosísimos satélites artificiales que orbitan geoestacionariamente, o no," + "\n" + "nuestro planeta (salvo los primeros de la historia.");
        System.out.println("\n" + "-Important information: " + "\n" + "This category is the largest, although it does not include the numerous" + "\n" + "artificial satellites that orbit our planet geostationarily or not" + "\n" + "(except for the first ones in history).");
        System.out.println("\n" + "Seleccione el planeta al cual quiere viajar / Select the planet to which you want to travel");
        System.out.println("1. Sol");
        System.out.println("2. Mercurio");
        System.out.println("3. Venus");
        System.out.println("4. Marte");
        System.out.println("5. Jupiter");
        System.out.println("6. Saturno");
        System.out.println("7. Urano y Nepturno");
        System.out.println("0. Elegir otro tipo de Nave / Choose a nother type of vessel");
    }

    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        unmanned_ship[] unmanned_ships1 = new unmanned_ship[10];
        unmanned_ships1[0] = new nave_planetas("Helios", "Activo");
        unmanned_ships1[1] = new nave_planetas("Mensajero", "Inactivo");
        unmanned_ships1[2] = new nave_planetas("Venera 4", "Inactivo");
        unmanned_ships1[3] = new nave_planetas("Curiosity", "Activo");
        unmanned_ships1[4] = new nave_planetas("Galileo", "Inactivo");
        unmanned_ships1[5] = new nave_planetas("Cassini-Huygens", "Activo");
        unmanned_ships1[6] = new nave_planetas("Viajero 2", "Activo");


        switch (opcion) {
            case 1:
                System.out.println(unmanned_ships1[0].ship2());
                return true;
            case 2:
                System.out.println(unmanned_ships1[1].ship2());
                return true;
            case 3:
                System.out.println(unmanned_ships1[2].ship2());
                return true;
            case 4:
                System.out.println(unmanned_ships1[3].ship2());
                return true;
            case 5:
                System.out.println(unmanned_ships1[4].ship2());
                return true;
            case 6:
                System.out.println(unmanned_ships1[5].ship2());
                return true;
            case 7:
                System.out.println(unmanned_ships1[7].ship2());
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




