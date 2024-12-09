package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
    protected static ArrayList<Animal> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    //Contructores//
    public Reptil(){
        super();
        listado.add(this);
    }
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    //Metodos//
    public void setColorEscamas(String newColor){
        this.colorEscamas = newColor;
    }
    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public void setLargoCola(int largo){
        this.largoCola = largo;
    }
    public int getLargoCola(){
        return this.largoCola;
    }

    public int cantidadReptiles(){
        return listado.size();
    }
    public String movimiento(){
        return "reptar";
    }
    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        Reptil.iguanas ++;
        return iguana;
    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        Reptil.serpientes ++;
        return serpiente;
    }
}
