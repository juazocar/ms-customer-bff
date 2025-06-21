package cl.marco.eli.ms_customer_bff.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@FeignClient(name = "customer-service", url = "${ferremas.bs-customers.url}")
public interface CustomerClient {
    @GetMapping("/api/customers")
    List<CustomerDTO> getAllCustomers();
}
