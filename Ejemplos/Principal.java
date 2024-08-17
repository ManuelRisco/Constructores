package Ejemplos;

public class Principal {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Manuel";
        persona1.edad = 20;
        persona1.ImprimirDatos();

        Persona persona2 = new Persona();
        persona2.nombre = "Piero";
        persona2.edad = 19;
        persona2.ImprimirDatos();
    }
}
