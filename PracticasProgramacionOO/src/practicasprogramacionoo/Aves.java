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
public class Aves extends Animal {
    private boolean vuelan;
    private int numero_huevos;

    public Aves(boolean vuelan, int numero_huevos) {
        this.vuelan = vuelan;
        this.numero_huevos = numero_huevos;
    }

    public boolean isVuelan() {
        return vuelan;
    }

    public void setVuelan(boolean vuelan) {
        this.vuelan = vuelan;
    }

    public int getNumero_huevos() {
        return numero_huevos;
    }

    public void setNumero_huevos(int numero_huevos) {
        this.numero_huevos = numero_huevos;
    }

}
