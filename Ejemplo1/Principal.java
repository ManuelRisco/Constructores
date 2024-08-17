package Ejemplo1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] marcas = new String[9];
        String[] modelos = new String[9];
        int[] anos = new int[9];
        Auto[] autos = new Auto[9];

        int[] ano = new int[9];
        do {
            System.out.println("---Menu de opciones---");
            System.out.println("Crear auto (1)");
            System.out.println("Mostrar autos (2)");
            System.out.println("Salir (0)");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                        System.out.println("Ingrese la marca");
                        marcas[Auto.contador] = scanner.nextLine();
                        System.out.println("Ingrese el modelo");
                        modelos[Auto.contador] = scanner.nextLine();
                        System.out.println("Ingrese el año");
                        anos[Auto.contador] = scanner.nextInt();
                        autos[Auto.contador] = new Auto(marcas[Auto.contador], modelos[Auto.contador], anos[Auto.contador]); 
                    break;
                case 2:
                for (int i = 0; i < Auto.contador; i++) {
                    System.out.println("Auto: "+(i+1));
                    autos[i].ImprimirDatos();
                    System.out.println();
                }
                break;
                case 0:
                System.exit(0);
                default:
                System.out.println("---Ingrese una opcion correcta---");
                    break;
            }
        } while (true);
    }
}
