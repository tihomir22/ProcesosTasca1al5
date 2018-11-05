/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionariotasca3;

/**
 *
 * @author mati
 */
public class ConcesionarioTasca3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coch=new Coche();
        Accesoris acc=new Accesoris(coch);
        Motor mot=new Motor(coch);
        Rodes rod=new Rodes(coch);
        Sistemaelectric se=new Sistemaelectric(coch);
        Vidres vid=new Vidres(coch);
        
        acc.start();
        mot.start();
        rod.start();
        se.start();
        vid.start();
    }
    
}
