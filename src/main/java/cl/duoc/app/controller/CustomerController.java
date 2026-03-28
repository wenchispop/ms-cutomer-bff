package cl.duoc.app.controller;

import cl.duoc.app.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    public Customer getCustomer(){
        Customer customer = new Customer(1,"abi","debo.palma@duocuc.cl");
        return customer;
    }
}
