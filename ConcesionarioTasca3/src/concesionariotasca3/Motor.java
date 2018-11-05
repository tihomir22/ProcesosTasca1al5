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
public class Motor extends Thread{
    
    private Coche coch;
    
    
    public void run(){
      
             coch.añadirMotor();
        
      
       
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
