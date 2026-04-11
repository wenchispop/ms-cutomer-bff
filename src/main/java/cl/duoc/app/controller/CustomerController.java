package cl.duoc.app.controller;

import cl.duoc.app.model.Customer;
import cl.duoc.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
        public List<Customer> getCustomers (){
        return customerService.getCustomers();
    }

    @GetMapping("/customer1")
        public Customer getCustomer (){
        return customerService.getCustomer();
        }

}
