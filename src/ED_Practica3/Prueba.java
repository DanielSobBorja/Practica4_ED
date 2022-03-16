/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ED_Practica3;

import java.util.Date;

/**
 *
 * @author carlos
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Niño tommy = new Niño();
        Niño pepe = new Niño("AulaB", new Juguete(),"Pepe", "67674B", 4 );
        System.out.println(pepe);
        
        //Adulto juan = new Adulto();
        Adulto carlos = new Adulto("Carlos", "4773346A", "564gssf", "Cala azul",29);
        System.out.println(carlos);
        
        //Persona test = new Persona(); // No se puede instanciar pq es abstracta
        
        Juguete paleta = new Juguete("paleta", 45, 4);
        pepe.setJuguete(paleta);
        System.out.println(pepe);
        
        //Mascota test2 = new Mascota(); // No se puede instanciar pq es abstracta
        Perro pepo = new Perro("Pepo", "raza chula",6);
        System.out.println(pepo);
        pepo.sonido();
        Gato misifu = new Gato("Misifú", "blanquete", 1);
        System.out.println(misifu);
        misifu.sonido();
        
        Barco titanic = new Barco("Titanic", new Date(), 400, "IKEA", "5000MW", 4005);
        System.out.println(titanic);
        titanic.sonido();
        titanic.setMotor("noIKEA", "454363MW", 1000);
        System.out.println(titanic.getMotor());
        titanic.getMotor().setPotencia("0");
        System.out.println(titanic);
    }
    
}
