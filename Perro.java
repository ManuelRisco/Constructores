public class Perro {
    private String nombre;
    private String raza;
    private int edad;

    // constructor
    public Perro(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }  
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getraza(){
        return raza;
    }
    public void setraza(String raza){
        this.raza = raza;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(String nombre){
        this.edad = edad;
    }
    }
