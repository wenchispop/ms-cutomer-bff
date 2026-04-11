package cl.duoc.app.controller;

import cl.duoc.app.model.Customer;
import cl.duoc.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/customer1")
    public ResponseEntity<Customer> getCustomer() {
        Customer customer = customerService.getCustomer();
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id) {
        //Customer customer = customerService.getCustomer();
        if (id > 3 || id < 1) {
            Customer errorCustomer = new Customer(); // pa que no de error con el constructor de 4 atributos
            errorCustomer.setName("id no encontrado o no presente en el sistema");
            return new ResponseEntity<>(errorCustomer, HttpStatus.BAD_REQUEST);
        }
        Customer customer = customerService.getCustomerById(id);

        if (customer != null) {
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping ("/customer")
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
        if(customer.getDni().equals("") || customer.getDni() == null) {
            return new ResponseEntity<>("El DNI no debe estar vacío", HttpStatus.BAD_REQUEST);
        } else if (customer.getId() == 1 || customer.getId() == 2 || customer.getId() == 3) {
            return new ResponseEntity<>("El ID no debe estar repetido", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>("Customer creado", HttpStatus.CREATED);
        }
    }


}