package modelo;
import modelo.VO.ObjetivoVO;

public abstract class Objetivo {

    private String nombre;
    private int tiempo;

    public abstract boolean seCompleto();
}
