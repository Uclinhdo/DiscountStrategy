/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author linhdo
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Register reg = new Register();
        reg.startNewSale("DUTL");
        reg.addProduct("A123",2);
        reg.addProduct("B345",7);
        reg.endSale();
    }
    
}
