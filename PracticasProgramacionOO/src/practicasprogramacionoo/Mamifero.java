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
public class Mamifero extends Animal{
    private double tiempo_gestacion; 
    private boolean sangre_caliente;

    public Mamifero() {
    }

    public Mamifero(double tiempo_gestacion, boolean sangre_caliente) {
        this.tiempo_gestacion = tiempo_gestacion;
        this.sangre_caliente = sangre_caliente;
    }

    public double getTiempo_gestacion() {
        return tiempo_gestacion;
    }

    public void setTiempo_gestacion(double tiempo_gestacion) {
        this.tiempo_gestacion = tiempo_gestacion;
    }

    public boolean isSangre_caliente() {
        return sangre_caliente;
    }

    public void setSangre_caliente(boolean sangre_caliente) {
        this.sangre_caliente = sangre_caliente;
    }
    
}
