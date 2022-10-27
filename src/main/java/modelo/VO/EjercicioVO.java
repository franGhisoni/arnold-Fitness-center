package modelo.VO;

import modelo.ExigenciaMuscular;
import modelo.GrupoMuscular;

import java.util.ArrayList;

public class EjercicioVO {
    private int cantidadSeries;
    private int repeticiones;
    private int pesoAsignado;
    private int tiempo;
    private int nivelAerobico;
    private ArrayList<GrupoMuscular> grupoMuscular;
    private ExigenciaMuscular exigenciaMuscular;

    public int getCantidadSeries() {
        return cantidadSeries;
    }

    public void setCantidadSeries(int cantidadSeries) {
        this.cantidadSeries = cantidadSeries;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getPesoAsignado() {
        return pesoAsignado;
    }

    public void setPesoAsignado(int pesoAsignado) {
        this.pesoAsignado = pesoAsignado;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getNivelAerobico() {
        return nivelAerobico;
    }

    public void setNivelAerobico(int nivelAerobico) {
        this.nivelAerobico = nivelAerobico;
    }

    public ArrayList<GrupoMuscular> getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(ArrayList<GrupoMuscular> grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public ExigenciaMuscular getExigenciaMuscular() {
        return exigenciaMuscular;
    }

    public void setExigenciaMuscular(ExigenciaMuscular exigenciaMuscular) {
        this.exigenciaMuscular = exigenciaMuscular;
    }
}
