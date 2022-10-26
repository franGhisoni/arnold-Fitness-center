package modelo.VO;

import modelo.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.ArrayList;


@EntityScan
@Table(name="Socios")
public class SocioVO {

        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name = "nombre", nullable = false)
        private String nombre;

        @Column(name = "apellido",nullable = false)
        private String apellido;

        @Column(name = "altura",nullable = true)
        private int altura;



        @JoinColumn(name="RutinaSocio")
        private ArrayList<Rutina> rutina;

        @Column(name = "sexo",nullable = false)
        private Sexo sexo;

        @JoinColumn(name="objetivo")
        private Objetivo objetivo;

        @OneToMany

        private ArrayList<Medicion> medicion;

        private ArrayList<Trofeo> trofeos;



        public SocioVO(){}

        public SocioVO(
                long id, String nombre, String apellido,
                int altura, ArrayList<Rutina> rutina,
                Sexo sexo, Objetivo objetivo, ArrayList<Medicion> medicion,
                ArrayList<Trofeo> trofeos)
        {
                this.id = id;
                this.nombre = nombre;
                this.apellido = apellido;
                this.altura = altura;
                this.rutina = rutina;
                this.sexo = sexo;
                this.objetivo = objetivo;
                this.medicion = medicion;
                this.trofeos = trofeos;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido() {
                return apellido;
        }

        public void setApellido(String apellido) {
                this.apellido = apellido;
        }

        public int getAltura() {
                return altura;
        }

        public void setAltura(int altura) {
                this.altura = altura;
        }


        public ArrayList<Rutina> getRutina() {
                return rutina;
        }

        public void setRutina(ArrayList<Rutina> rutina) {
                this.rutina = rutina;
        }

        public Sexo getSexo() {
                return sexo;
        }

        public void setSexo(Sexo sexo) {
                this.sexo = sexo;
        }

        public Objetivo getObjetivo() {
                return objetivo;
        }

        public void setObjetivo(Objetivo objetivo) {
                this.objetivo = objetivo;
        }

        public ArrayList<Medicion> getMedicion() {
                return medicion;
        }

        public void setMedicion(ArrayList<Medicion> medicion) {
                this.medicion = medicion;
        }

        public ArrayList<Trofeo> getTrofeos() {
                return trofeos;
        }

        public void setTrofeos(ArrayList<Trofeo> trofeos) {
                this.trofeos = trofeos;
        }
}

