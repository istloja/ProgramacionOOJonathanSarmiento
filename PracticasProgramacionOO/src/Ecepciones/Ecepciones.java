    
package Ecepciones;

import java.util.Scanner;

public class Ecepciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
       System.out.println("Por favor ingrese un numero ");
        int numero = 0;
        try { //Parte que va a proteger
            numero = entrada.nextInt();
        } catch (Exception e) { //Menasaje cuando la proteccion se incumpla
            System.out.println("Se ha generado la ecepcion: " +e);
        }
//      finally{// se ejecuta siempre que una excepcion ocurra y se ejecuta en seguida  :  la accion que se debio haberse realizado
//            System.out.println("Ingrese un numero correcto");
//             numero = entrada.nextInt();
//      }
        System.out.println("El numero ingresado es: " + numero);
        try{
            int resultado = numero / 0;
        }catch (Exception e){
        System.out.println("No se puede dividir para cero ");
        }
    }
}
