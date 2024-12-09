package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
    protected static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private Boolean venenoso;
    
    //Constructores//
    public Anfibio(){
        super();
        listado.add(this);
    }
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso){
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }
    
    //Metodos//
    public void setVenenoso(Boolean newVeneno){
        this.venenoso = newVeneno;
    }
    public Boolean isVenenoso(){
        return this.venenoso;
    }
    public String getColorPiel(){
        return this.colorPiel;
    }
    public void setColorPiel(String newColor){
        this.colorPiel = newColor;
    }

    public int cantidadAnfibios(){
        return listado.size();
    }
    public String movimiento(){
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio rana = new Anfibio(nombre, edad, "selva" , genero, "rojo", true);
        Anfibio.ranas ++;
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio salamandra = new Anfibio(nombre, edad,"selva", genero, "negro y amarillo ", false);
        Anfibio.salamandras ++;
        return salamandra;
    }
}
