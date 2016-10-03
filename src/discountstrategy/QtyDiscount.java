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
public class QtyDiscount implements DiscountStrategy {
    private double discountRate = 0.10;

    public QtyDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    
    @Override
    public final double getdiscountAmount(double unitPrice,int qty){
        if(qty == 5){
            return  unitPrice * qty * discountRate;
        }else{
            return unitPrice * qty;
        }
    }

    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }    
    
}
