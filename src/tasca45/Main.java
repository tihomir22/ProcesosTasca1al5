/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasca45;

/**
 *
 * @author sportak
 */
public class Main {

    public static void main(String args[]) {
        Buffer buf = new Buffer();
        Productor prod = new Productor(buf, 300);
        Consumidor cons = new Consumidor(buf, 1200);

        prod.start();
        cons.start();

    }
}
