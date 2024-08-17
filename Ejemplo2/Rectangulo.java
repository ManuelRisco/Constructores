package Ejemplo2;

public class Rectangulo {
    double ancho;
    double alto;
    static int contador = 0;

    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
        contador++;
    }
    public double Area(){
        return ancho * alto;  
    }
    public double Perimetro(){
        return 2*(ancho+alto);
    }
    public void ImprimirArea(){
        System.out.println("El Area es: "+Area());
    }
    public void ImprimirPerimetro(){
        System.out.println("El perimetro es: "+Perimetro());
    }
}