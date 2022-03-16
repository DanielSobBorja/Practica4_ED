/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED_Practica3;

/**
 *
 * @author carlos
 */
public class Motor {

    //Atributos
    private String fabricante;
    private String potencia;
    private int codigo;

    //Constructor vacío

    /**
     *
     */
    public Motor() {
    }
    //Constructor lleno

    /**
     *
     * @param fabricante
     * @param potencia
     * @param codigo
     */
    public Motor(String fabricante, String potencia, int codigo) {
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.codigo = codigo;
    }

    //Getters y Setters

    /**
     *
     * @return
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     *
     * @param fabricante
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     *
     * @return
     */
    public String getPotencia() {
        return potencia;
    }

    /**
     *
     * @param potencia
     */
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    /**
     *
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Motor{" + "fabricante=" + fabricante + ", potencia=" + potencia + ", codigo=" + codigo + "}";
    }

}
