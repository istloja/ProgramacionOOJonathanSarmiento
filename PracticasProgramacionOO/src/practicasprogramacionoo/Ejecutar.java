/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicasprogramacionoo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejecutar {
    public static void main(String[] args) {
        
    Animal animal_objeto=new Animal("perro", 12.3, "blanco", 2.3);
    Aves objeto2=new Aves(true, 4);
    Mamifero objeto3=new Mamifero(2.3, true);
    animal_objeto.alimentar();
    objeto2.alimentar();
    objeto3.alimentar();
    String dato=animal_objeto.InformacionAnimal();
    System.out.println(dato);
}
}
