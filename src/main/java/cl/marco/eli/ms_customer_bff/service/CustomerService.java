package cl.marco.eli.ms_customer_bff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.marco.eli.ms_customer_bff.clients.CustomerClient;
import cl.marco.eli.ms_customer_bff.model.dto.CustomerDTO;

@Service
public class CustomerService {

    @Autowired
    private CustomerClient customerClient;

     public List<CustomerDTO> getAllCustomers(){
        return customerClient.getAllCustomers();
     }
}
