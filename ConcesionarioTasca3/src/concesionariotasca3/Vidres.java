/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionariotasca3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mati
 */
public class Vidres extends Thread {
    
    private Coche coch;
    
    public void run() {
       
            try {
                coch.añadirVidres();
            } catch (InterruptedException ex) {
                Logger.getLogger(Vidres.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        
    }
    
    public Vidres(Coche coch) {
        this.coch = coch;
        this.setName("vidres");
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
