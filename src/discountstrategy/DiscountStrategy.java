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
public interface DiscountStrategy {

    double getDiscountRate();

    double getdiscountAmount(double unitPrice, int qty);

    void setDiscountRate(double discountRate);
    
}
