package zooAnimales;
import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    private Zona zona;

    //Constructores//
    public Animal(){
        this(null, 0, null, null);
        totalAnimales ++;
    }
    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }

    //Metodos//
    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int newEdad){
        this.edad = newEdad;
    }
    public int getedad(){
        return this.edad;
    }    public void setHabitat(String newHabitat){
        this.habitat = newHabitat;
    }
    public String getHabitat(){
        return this.habitat;
    }    public void setGenero(String newGenero){
        this.genero = newGenero;
    }
    public String getGenero(){
        return this.genero;
    }

    public int getTotalAnimales(){
        return totalAnimales;
    }
    public Zona getZona(){
        return this.zona;
    }
    public void setZona(Zona newZona){
        this.zona = newZona;
    }

    public String movimiento(){
        return "desplazarse";
    }
    public String totalPorTipo(){
        String msj = "Mamiferos: " + Mamifero.listado.size() + "\n" + "Aves: " + Ave.listado.size() + "\n" + "Reptiles: " + Reptil.listado.size() + "\n" + "Peces: " + Pez.listado.size() + "\n" + "Anfibios: " + Anfibio.listado.size();
        return msj;
    }

    public String toString(){
        if(this.zona != null ){
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona.getNombre() + " en el " + this.zona.getZoo().getNombre();
        }
        else{
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero;
        }
        
    }
}
