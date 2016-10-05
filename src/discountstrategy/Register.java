/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author ldo
 */
public class Register {
    private Product product;
    private Receipt receipt;
    
 
    public void endSale(){
        
    }

    public void startNewSale(String customerId) {
        
        
    }

   public void addProduct(String productId, int qty) {
        receipt.AddItemToReceipt(productId, qty);
    }

   
    
}
