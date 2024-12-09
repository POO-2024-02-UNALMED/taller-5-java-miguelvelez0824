package gestion;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<>();

    //Constructores//
    public Zoologico(){
        this(null, null);
    }
    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    //Metodos//
    public void agregarZonas(Zona newZona){
        this.zonas.add(newZona);
    }
    public ArrayList<Zona> getZona(){
        return this.zonas;
    }

    public int cantidadTotalAnimales(){
        int cont = 0;
        for(Zona zonasTotales : zonas){
            cont += zonasTotales.cantidadAnimales();
        }
        return cont;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
    public String getUbicacion(){
        return this.ubicacion;
    }
    public void setUbicacion(String newUbicacion){
        this.ubicacion = newUbicacion; 
    }
}
