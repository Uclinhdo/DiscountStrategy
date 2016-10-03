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
public class ReceiptConsoleOutput implements ReceiptOutputStrategy {
    
    
    
    @Override
    public void printReceipt(Receipt receipt){
        System.out.println(receipt);
    }
    
}
