import java.util.Scanner;

public class Introduccion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perro perro = new Perro("Machin", "Pug", 8);
        System.out.println("Nombre: "+perro.getnombre());
        System.out.println("Nombre: "+perro.getraza());
        System.out.println("Nombre: "+perro.getedad());

    }
}