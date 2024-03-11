package piko.dev.pikodev.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import piko.dev.pikodev.entities.Customer;
import piko.dev.pikodev.repositories.CustomerRepository;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerRepository customerRepository;


    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/Customers")
    private List<Customer> getCustomers(){

    return  customerRepository.findAll();}













}
