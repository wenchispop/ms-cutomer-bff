package cl.duoc.app.service;

import cl.duoc.app.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
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

    public Customer getCustomer (){
        Customer customer1 = new Customer(1,"1-1","Elva Lazo","Elva@gmail.com");
        return customer1;
    }
}
