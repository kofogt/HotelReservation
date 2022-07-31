package model;

import service.CustomerService;

public class Driver {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        customerService.addCustomer("Kofgt@gmail.com","Korola","GjjjjjT");
        customerService.addCustomer("Kofosgt@gmail.com","Kofoworola","GT");
        System.out.println(customerService.getCustomer("Kofosgt@gmail.com"));
        System.out.println(customerService.getAllCustomers());
//        customerKofo();
//        customerException();

    }

    private static void customerKofo() {
        Customer customer = new Customer("Kofoworola","George taylor", "kofogt@gmail.com");
        System.out.println(customer);
    }
    private static void customerException() {
        Customer customer = new Customer("Kofoworola","George taylor", "kofogtgmail.com");
        System.out.println(customer);
    }
}
