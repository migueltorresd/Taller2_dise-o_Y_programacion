package Vehiculo_lanzedera;
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
        System.out.println("------- No.3 Taller de Ciclos ------- ");
        System.out.println("Escoja un punto del taller");
        System.out.println("1. nave americana");
        System.out.println("2. nave rusa");
        System.out.println("0. Salir del taller");
    }

    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        spacecraft[] spacecrafts2 = new spacecraft[2];
        spacecrafts2[0] = new nave1("3500", "118", "2900", "100", "Saturno V", "EEUU");
        spacecrafts2[1] = new nave1("3060", "100", "2400", "100","Energia", "rusia");


        switch (opcion) {
            case 1:
                for (spacecrafts2)
                    System.out.println(na.nave());
                    System.out.println(na.empuje());
                    System.out.println();
                return true;
            case 2:
                System.out.println("segundo");
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




