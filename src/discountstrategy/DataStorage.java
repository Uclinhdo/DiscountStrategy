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
public interface DataStorage {

    public abstract Customer findValidCustomer(String customerId);

    public abstract Product findValidProduct(String productId);
    
}
