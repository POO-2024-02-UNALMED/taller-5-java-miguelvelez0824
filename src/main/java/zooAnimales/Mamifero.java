package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
    protected static ArrayList<Animal> listado = new ArrayList<>();
    public static int caballos; 
    public static int leones;
    private Boolean pelaje; 
    private int patas; 

    //Contructores//
    public Mamifero(){
        super();
        listado.add(this);
    }
    public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas){
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    //Metodos//
    public Boolean isPelaje(){
        return this.pelaje;
    }
    public void setPelaje(Boolean pelaje){
        this.pelaje = pelaje;
    }
    public int getPatas(){
        return this.patas;
    }
    public void setPatas(int numPatas){
        this.patas = numPatas;
    }

    public int cantidadMamiferos(){
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        Mamifero.caballos ++;
        return caballo;
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        Mamifero.leones ++;
        return leon;
    }
}

