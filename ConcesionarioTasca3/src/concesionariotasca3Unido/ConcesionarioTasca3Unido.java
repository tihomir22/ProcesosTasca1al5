/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionariotasca3Unido;

/**
 *
 * @author mati
 */
public class ConcesionarioTasca3Unido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coch=new Coche();
 
        MontageThread vid=new MontageThread(coch,"motor");
        MontageThread vid2=new MontageThread(coch,"accesoris");
        MontageThread vid3=new MontageThread(coch,"rodes");
        MontageThread vid4=new MontageThread(coch,"sistemaelectric");
        MontageThread vid5=new MontageThread(coch,"vidres");
        
        
       
        vid.start();
        vid2.start();
        vid3.start();
        vid4.start();
        vid5.start();
    }
    
}
