package service;

import model.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerService {
    private static  List<Customer>  customers = new ArrayList<>();
    public void addCustomer(String emailAddress,String firstName, String lastName){
     Customer customer = new Customer(firstName,lastName,emailAddress);
        customers.add(customer);
    }
   public Customer getCustomer(String customerEmail){
        if (!customers.isEmpty()){
            for(Customer customer: customers){
                if (customer.getEmailAddress().equals(customerEmail)){
                    return customer;
                }
            }
            return null;
        }
        return null;
   }
    public Collection <Customer> getAllCustomers(){
        if (!customers.isEmpty()) {
            return customers;
        }
        return null;
    }
}
