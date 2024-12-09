package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    protected static ArrayList<Animal> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    //Contructores//
    public Ave(){
        super();
        listado.add(this);
    }
    public Ave(String nombre, int edad, String habitat, String genero, String colorplumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorplumas;
        listado.add(this);
    }
    
    //Metodos//
    public void setColorPlumas(String newColor){
        this.colorPlumas = newColor;
    }
    public String getColorPlumas(){
        return this.colorPlumas;
    }
    
    public String movimiento(){
        return "volar";
    }
    public int cantidadAves(){
        return listado.size();
    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave halcon = new Ave(nombre, edad, "montañas", genero,"café glorioso");
        Ave.halcones ++;
        return halcon;
    }
    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave aguila = new Ave(nombre, edad, "montañas", genero,"blanco y amarillo");
        Ave.aguilas ++;
        return aguila;
    }
}
