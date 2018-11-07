/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionariotasca3Unido;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mati
 */
public class MontageThread extends Thread {
    
    private Coche coch;
    private String nombre;
    
    public void run() {
        while (true) {
            try {
                coch.añadirPieza(this.getName());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MontageThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public MontageThread(Coche coch, String nombre) {
        this.coch = coch;
        this.setName(nombre);
    }
    
    public Coche getCoch() {
        return coch;
    }
    
    public void setCoch(Coche coch) {
        this.coch = coch;
    }
    
    @Override
    public String toString() {
        return "Vidres{" + "coch=" + coch + '}';
    }
    
}
