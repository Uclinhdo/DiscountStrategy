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
public class Receipt {
    private Customer customer;
    private Product product;
    private MakeupDatabase fakedatabase;
    private LineItem [] item;

    public Receipt(Customer customer, Product product, MakeupDatabase fakedatabase, LineItem[] item) {
        this.customer = customer;
        this.product = product;
        this.fakedatabase = fakedatabase;
        this.item = item;
    }

    
    
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public MakeupDatabase getFakedatabase() {
        return fakedatabase;
    }

    public void setFakedatabase(MakeupDatabase fakedatabase) {
        this.fakedatabase = fakedatabase;
    }

    public LineItem[] getItem() {
        return item;
    }

    public void setItem(LineItem[] item) {
        this.item = item;
    }

    
    
    
}
