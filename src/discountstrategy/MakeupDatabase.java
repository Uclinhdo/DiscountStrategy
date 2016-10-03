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
public class MakeupDatabase implements DataAccessingStrategy {
   private Customer [] customers= { new Customer ("DUTL","Linh","Do","888-888-8888"),
                                    new Customer ("MTRA","Matt","Ament","123-456-7890"),
                                    new Customer ("HEAE","Ares","Ament","999-999-9999")
                                  };
           
    private Product [] products = { new Product("A123","Brewers BLue Hat",29.90, new NoDiscount()),
                                    new Product("B345","Calvin Klein Blue Jeans",88.50,new PercentOffDiscount(0.10)),
                                    new Product("C157","Lamb Chop-Pet Toy",5.25,new QtyDiscount(.10))
                                  };
    
    
    @Override
    public final Customer findValidCustomer(String customerId){
        if(customerId == null || customerId.length() == 0){
            System.out.println("Sorry, KOHL Database System cannot " +
                    "find your data!");
            return null;
        }
        Customer validcustomer = null;
        for(Customer customer : customers){
            if(customerId.equals(customer.getCustomerId())){
                validcustomer = customer;
            break;
            }
        }
        return validcustomer;
    }
    
    
    
    @Override
    public final Product findValidProduct(String productId){
        if(productId == null || productId.length()==0){
            System.out.println("Sorry, KOHL Database System cannot " +
                    "find the product data!");
            return null;
        }
        Product validproduct = null;
        for (Product product : products){
            if(productId.equals(product.getProductId())){
                validproduct = product;
                break;
            }
           
        }
         return validproduct;
    }
    
}