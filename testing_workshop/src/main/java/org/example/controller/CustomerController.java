package org.example.controller;

import org.example.entity.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public String getCustomers(Model model) {

        List<Customer> customers = customerRepository.findAll();

        model.addAttribute("customers", customers);

        return "customers";
    }
}
