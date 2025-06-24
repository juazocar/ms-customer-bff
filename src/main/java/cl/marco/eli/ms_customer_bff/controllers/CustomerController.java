package cl.marco.eli.ms_customer_bff.controllers;

import cl.marco.eli.ms_customer_bff.model.dto.CustomerDTO;
import cl.marco.eli.ms_customer_bff.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/store/customers")
@CrossOrigin(origins = "*")
public class CustomerController {
   
    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<CustomerDTO> getCustomers() { 
        return customerService.getAllCustomers(); 
    }
}