package Ejemplo1;

public class Auto {
    String marca;
    String modelo;
    int ano;
    static int contador = 0;

    
    public Auto(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        contador++;
    }
    public Auto(String Marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public Auto(String Marca){
        this.marca = marca;
    }
    public Auto(){

    }
    public void ImprimirDatos(){
        if (marca != null) {
            System.out.println("Marca: " + marca);
        } else {
            System.out.println("Marca no especificada");
        }

        if (modelo != null) {
            System.out.println("Modelo: " + modelo);
        } else {
            System.out.println("Modelo no especificado");
        }

        if (ano != 0) {
            System.out.println("Año: " + ano);
        } else {
            System.out.println("Año no especificado");
        }
    }
    }

