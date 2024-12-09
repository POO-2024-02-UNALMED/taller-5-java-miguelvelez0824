package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
    protected static ArrayList<Animal> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    //Contructores//
    public Pez(){
        super();
        listado.add(this);
    }
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int numAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = numAletas;
    }

    //Metodos//
    public void setColorEscamas(String newColor){
        this.colorEscamas = newColor;
    }
    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public void setCantidadAletas(int newcantidad){
        this.cantidadAletas = newcantidad;
    }
    public int getCantidadAletas(){
        return this.cantidadAletas;
    }

    public int cantidadPeces(){
        return listado.size();
    }
    public String movimiento(){
        return "nadar";
    }
    public static Pez crearSalmon(String nombre, int edad, String genero){
        Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        Pez.salmones ++;
        return salmon;
    }
    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        Pez.bacalaos ++;
        return bacalao;
    }
}
