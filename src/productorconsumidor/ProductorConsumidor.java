/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidor;

/**
 *
 * @author sportak
 */
public class ProductorConsumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Cola co = new Cola();
        Productor prod = new Productor(co);
        Consumidor cons = new Consumidor(co);

        prod.start();
        cons.start();
    }

}
