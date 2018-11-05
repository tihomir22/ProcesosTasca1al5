/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasca45;

import java.util.ArrayList;

/**
 *
 * @author sportak
 */
public class Buffer extends ArrayList<Integer> {

    public Buffer() {

    }

    public synchronized void añadir(int num) throws InterruptedException {
        if (this.size() == 5) {
            System.out.println("Warning: Full buffer!");
            this.wait();
        } else {
            System.out.println("He añadido " + num);
            this.add(num);
            this.notify();
        }
    }

    public synchronized int sacar() throws InterruptedException {
        if (!this.isEmpty()) {
            int num = this.get(0);
            this.remove(0);
            System.out.println("\t\t\t\t\t He consumido " + num);
            this.notify();
            return num;
        } else {
            System.out.println("Warning: Empty buffer!");
            this.wait();
        }
        return -1;
    }

    public int getModCount() {
        return modCount;
    }

    public void setModCount(int modCount) {
        this.modCount = modCount;
    }

    @Override
    public String toString() {
        return "Buffer{" + '}';
    }

}
