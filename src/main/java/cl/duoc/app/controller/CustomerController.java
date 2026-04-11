package cl.duoc.app.controller;

import cl.duoc.app.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @GetMapping("/customer")
        public List<Customer> getCustomers (){
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer(1,"1-1","Elva Lazo","Elva@gmail.com");
        Customer customer2 = new Customer(2,"1-2","Elva Zura","ElvaZurero@gmail.com");
        Customer customer3 = new Customer(3,"1-3","Aquiles Bailo","Aquiles_Bailo@gmail.com");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        return customerList;
    }

    /*
    public Customer getCustomer(){
        Customer customer = new Customer(1,"12.345.678-9","abi","debo.palma@duocuc.cl");
        return customer;
    }
   */

}
