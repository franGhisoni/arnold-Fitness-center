package DTO;
import Socio;
import java.io.Serializable;

public class SocioDTO implements Serializable {
    private int idSocio;
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Rutina> rutina;
    private Sexo sexo;
    private Objetivo objetivo;
    private ArrayList<Medicion> medicion;
    private ArrayList<Trofeo> trofeos;


    public int getIdSocio() {
        return idSocio;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;

    }
    public ArrayList<Rutina> getRutina(){
        return rutina;
    }
    public Sexo getSexo(){
        return sexo;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public ArrayList<Medicion> getMedicion() {
        return medicion;
    }

    public ArrayList<Trofeo> getTrofeos() {
        return trofeos;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    /**
     *
     * @param apellido
     */

    public void setApellido (String apellido){
        this.apellido = apellido;
    }

    /**
     *
     * @param edad
     */

    public void setEdad (int edad){
        this.edad = edad;
    }
    public void setPeso (ArrayList<Peso> peso){}

    /**
     *
     * @param altura
     */
    public void setAltura (int altura){
        this.altura = altura;
    }
    public ArrayList<Rutina> setRutina(){}
/** no c */
    public void setSexo(Sexo sexo)
        this.sexo = sexo;



}

