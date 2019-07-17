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
public class Animal {
    private String nombre;
    private double peso;
    private String color;
    private double altura;

    public Animal() {
    }

    public Animal(String nombre, double peso, String color, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.color = color;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;

    }
      public void alimentar(){
        System.out.println("Soy "+nombre+" y me alimento");
    }

    public String InformacionAnimal(){
    String cadena="Soy un "+nombre+ "Mi peso es: "+peso+ "mi color es: "+color;
    return cadena;
    }
}
