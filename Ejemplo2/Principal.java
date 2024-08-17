package Ejemplo2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rectangulo[] rectangulos = new Rectangulo[9];
        double[] anchos = new double[9];
        double[] altos = new double[9];
        do {
            System.out.println("---Menu de opciones---");
            System.out.println("Crear rectangulo (1)");
            System.out.println("Mostrar rectangulos (2)");
            System.out.println("Salir del programa (0)");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ancho: ");
                    anchos[Rectangulo.contador] = scanner.nextDouble();
                    System.out.print("Ingrese el alto: ");
                    altos[Rectangulo.contador] = scanner.nextDouble();
                    rectangulos[Rectangulo.contador] = new Rectangulo(anchos[Rectangulo.contador], altos[Rectangulo.contador]);
                    break;
                case 2:
                for (int i = 0; i < Rectangulo.contador; i++) {
                    System.out.println("Rectangulo: "+(i+1)+"\nCon valores: Ancho -> "+rectangulos[i].ancho+" y Alto -> "+rectangulos[i].alto);
                    System.out.println("Area: "+rectangulos[i].Area());
                    System.out.println("Perimetro: "+rectangulos[i].Perimetro());
                    System.out.println("--------------------");
                }
                break;
                case 0:
                System.out.println("Saliendo del programa...");
                System.exit(0);
                default:
                System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (true);
    }
    
}
