/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidor;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sportak
 */
public class Cola extends ArrayList<Integer> {

    public Cola() {
    }

    public synchronized void añadirNumero(int num) {
        this.add(num);
    }

    public synchronized void leerNumero() {
        if (this.isEmpty()) {
            System.out.println("Esta vacia la cosa");
        } else {
            System.out.println("numero leido" + this.get(0));
            System.out.println("Quedan " + this.size());
            this.remove(0);
        }
    }

    @Override
    public String toString() {
        return "Cola{" + "listaNumeros=" + this + '}';
    }

}
