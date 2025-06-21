package cl.marco.eli.ms_customer_bff.controllers;

import cl.marco.eli.ms_customer_bff.clients.CustomerClient;
import cl.marco.eli.ms_customer_bff.clients.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/store/customers")
@CrossOrigin(origins = "*")
public class CustomerController {
    @Autowired
    private CustomerClient customerClient;
    @GetMapping
    public List<CustomerDTO> getCustomers() { return customerClient.getAllCustomers(); }
}