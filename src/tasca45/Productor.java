/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasca45;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sportak
 */
public class Productor extends Thread {

    private Buffer cola;
    private long tiempoEspera;

    public void run() {
        while (true) {
            try {
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.cola.añadir((int) Math.floor(Math.random() * 50));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Productor(Buffer cola, long tiempoEspera) {
        this.cola = cola;
        this.tiempoEspera = tiempoEspera;
    }

    public Buffer getCola() {
        return cola;
    }

    public void setCola(Buffer cola) {
        this.cola = cola;
    }

    public long getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(long tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

}
