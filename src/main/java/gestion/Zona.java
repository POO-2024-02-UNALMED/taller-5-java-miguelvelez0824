package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<>();

    //Constructores//
    public Zona(){
        this(null, null);
    }
    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    //Metodos//
    public void agregarAnimales(Animal newanimal){
        this.animales.add(newanimal);
    }

    public int cantidadAnimales(){
        return animales.size();
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setZoo(Zoologico newZoo){
        this.zoo = newZoo;
    }
    public Zoologico getZoo(){
        return this.zoo;
    }
}
