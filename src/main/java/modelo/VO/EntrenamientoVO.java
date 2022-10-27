package modelo.VO;

import modelo.Ejercicio;
import modelo.Objetivo;

import java.util.ArrayList;

public class EntrenamientoVO {


    private ArrayList<Ejercicio> ejercicios;
    private Objetivo objetivo;

    public void cambiarObjeivo(Objetivo objetivo) {

    }

    public int calcularTiempo(ArrayList<Ejercicio> ejercicios, Objetivo objeitvo) {
        return 0;
    }


    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }
}

