/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionariotasca3;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class Coche {

    ArrayList<String> listaPiezas = new ArrayList<>();
    private boolean motor = false;
    private boolean sistemaelectric = false;
    private boolean accesoris = false;
    private boolean vidres = false;
    private boolean rodes = false;

    public Coche() {

    }

    public synchronized void añadirMotor() {
        while (true) {
            if (this.listaPiezas.size() == 0) {
                this.listaPiezas.add("motor");
                this.motor = true;
                System.out.println(this.toString());
                this.notifyAll();
                break;
            }
        }
    }

    public synchronized void añadirSistemaElectric() throws InterruptedException {
        while (true) {
            if (this.motor == true) {
                this.listaPiezas.add("sistemaElectric");
                this.sistemaelectric = true;
                System.out.println(this.toString());
                this.notifyAll();
                break;
            } else {
                this.wait();
            }
        }
    }

    public synchronized void añadirAccesoris() throws InterruptedException {
        while (true) {
            if (this.sistemaelectric == true) {
                this.listaPiezas.add("accesoris");
                this.accesoris = true;
                System.out.println(this.toString());
                this.notifyAll();
                break;
            } else {
                this.wait();
            }
        }
    }

    public synchronized void añadirVidres() throws InterruptedException {
        while (true) {
            if (this.accesoris == true) {
                this.listaPiezas.add("vidres");
                this.vidres = true;
                System.out.println(this.toString());
                this.notifyAll();
                break;
            } else {
                this.wait();
            }
        }
    }

    public synchronized void añadirRodes() throws InterruptedException {
        while (true) {
            if (this.vidres == true) {
                this.listaPiezas.add("rodes");
                this.rodes = true;
                System.out.println(this.toString());
                this.notifyAll();
                break;
            } else {
                this.wait();
            }
        }
    }

    public ArrayList<String> getListaPiezas() {
        return listaPiezas;
    }

    public void setListaPiezas(ArrayList<String> listaPiezas) {
        this.listaPiezas = listaPiezas;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isSistemaelectric() {
        return sistemaelectric;
    }

    public void setSistemaelectric(boolean sistemaelectric) {
        this.sistemaelectric = sistemaelectric;
    }

    public boolean isAccesoris() {
        return accesoris;
    }

    public void setAccesoris(boolean accesoris) {
        this.accesoris = accesoris;
    }

    public boolean isVidres() {
        return vidres;
    }

    public void setVidres(boolean vidres) {
        this.vidres = vidres;
    }

    public boolean isRodes() {
        return rodes;
    }

    public void setRodes(boolean rodes) {
        this.rodes = rodes;
    }

    @Override
    public String toString() {
        return "Coche{" + "listaPiezas=" + listaPiezas + '}';
    }

   

}
