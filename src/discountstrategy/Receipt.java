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
    private DataStorage ds;
    private LineItem [] listOfitem;

    public Receipt(Customer customer, Product product, DataStorage ds, LineItem[] listOfitem) {
        this.customer = customer;
        this.product = product;
        this.ds= ds;
        this.listOfitem = listOfitem;
    }

    public void AddItemtoArray(LineItem[] arrayItem ,LineItem item)
    {
        LineItem [] temp = new LineItem[arrayItem.length + 1];
        System.arraycopy(arrayItem, 0, temp, 0, arrayItem.length + 1);
        
        temp[arrayItem.length - 1] = item;
        arrayItem = temp;
        listOfitem = arrayItem;
        
        temp = null;
        
    }
    
    public void AddItemToReceipt(String productId, int qty)
    {
        LineItem item = new LineItem(qty,ds.findValidProduct(productId));
        AddItemtoArray(listOfitem,item);
        
    }
    
    public void AddCustomerToReceipt(String customerId)
    {
      //DataStorage customer = new Customer(ds.findValidCustomer(customerId));
    }
    
    
    
}
