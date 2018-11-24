/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionariotasca3Unido;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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
    Lock lock = new ReentrantLock();
    Condition condMotor = lock.newCondition();
    Condition condRodes = lock.newCondition();
    Condition condAccesoris = lock.newCondition();
    Condition condSis = lock.newCondition();
    Condition condVidres = lock.newCondition();

    public Coche() {

    }

    public void añadirPieza(String nombreThread) throws InterruptedException {
        this.lock.tryLock(1000, TimeUnit.MILLISECONDS);
        try {
            switch (nombreThread) {
                case "motor":
                    if (this.listaPiezas.isEmpty()) {
                        this.listaPiezas.add("motor");
                        this.motor = true;
                        System.out.println(this.toString());
                        // this.cond.signal();
                        this.condSis.signal();
                    } else {

                    }
                    break;
                case "rodes":
                    if (this.vidres == true) {
                        this.listaPiezas.add("rodes");
                        this.rodes = true;
                        System.out.println(this.toString());
                        this.vidres = false;
                        if (this.listaPiezas.size() == 5) {
                            this.nuevoCoche();
                        }
                    } else {
                        this.condRodes.await();
                    }
                    break;
                case "accesoris":
                    if (this.sistemaelectric == true) {
                        this.listaPiezas.add("accesoris");
                        this.accesoris = true;
                        this.sistemaelectric = false;
                        System.out.println(this.toString());
                        this.condVidres.signal();
                    } else {
                        this.condAccesoris.await();
                    }
                    break;
                case "sistemaelectric":
                    if (this.motor == true) {
                        this.listaPiezas.add("sistemaElectric");
                        this.sistemaelectric = true;
                        this.motor = false;
                        System.out.println(this.toString());
                        this.condAccesoris.signal();
                    } else {
                        this.condSis.await();
                    }

                    break;
                case "vidres":
                    if (this.accesoris == true) {
                        this.listaPiezas.add("vidres");
                        this.vidres = true;
                        this.accesoris = false;
                        System.out.println(this.toString());
                        this.condRodes.signal();
                    } else {
                        this.condVidres.await();
                    }
                    break;
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void nuevoCoche() {
        System.out.println("Un coche se ha generado se hace otro");
        this.listaPiezas.clear();
        this.accesoris = false;
        this.motor = false;
        this.rodes = false;
        this.sistemaelectric = false;
        this.vidres = false;
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
