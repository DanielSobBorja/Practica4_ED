/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED_Practica3;

/**
 *
 * @author carlos
 *
 * Mediante la palbra reservada extends se inndica que la clase niño hereda de
 * la clase persona
 */
public class Ni�o extends Humano {

    //Atributos
    private String colegio;
    //Al tratarse de una relación de agregación es necesario añadir el objeto juguete dentro de la clase Niño
    private Juguete juguete;

    //Constructor vacío

    /**
     *
     */
    public Ni�o() {
    }
    //Constructor lleno

    /**
     *
     * @param colegio
     * @param juguete
     * @param nombre
     * @param DNI
     * @param edad
     */
    public Ni�o(String colegio, Juguete juguete, String nombre, String DNI, int edad) {
        super(nombre, DNI, edad);
        this.colegio = colegio;
        this.juguete = juguete;
    }

    //Getters y Setters

    /**
     *
     * @return
     */
    public String getColegio() {
        return colegio;
    }

    /**
     *
     * @param colegio
     */
    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    /**
     *
     * @return
     */
    public Juguete getJuguete() {
        return juguete;
    }

    /**
     *
     * @param juguete
     */
    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Ni�o" + "colegio=" + colegio + ", Juguete=" + juguete + ", nombre=" + getNombre() + ", DNI=" + getDNI() + ", edad=" + getEdad() + "}";

    }

}
