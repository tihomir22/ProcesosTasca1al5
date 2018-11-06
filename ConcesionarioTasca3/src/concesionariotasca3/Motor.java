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
public class Motor extends Thread {

    private Coche coch;

    public void run() {
        while (true) {
            coch.añadirMotor();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Motor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public Motor(Coche coch) {
        this.coch = coch;
        this.setName("motor");
    }

    public Coche getCoch() {
        return coch;
    }

    public void setCoch(Coche coch) {
        this.coch = coch;
    }

    @Override
    public String toString() {
        return "Motor{" + "coch=" + coch + '}';
    }

}
