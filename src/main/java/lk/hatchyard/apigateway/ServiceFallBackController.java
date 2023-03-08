package lk.hatchyard.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fall-back")
public class ServiceFallBackController {

    @GetMapping("/customer-service")
    public String customerServiceFallBackMethodGet() {
        return "Customer Service Not Working";
    }

    @PostMapping("/customer-service")
    public String customerServiceFallBackMethodPost() {
        return "Customer Service Not Working";
    }

    @GetMapping("/product-service")
    public String productServiceFallBackMethodGet() {
        return "Product Service Not Working";
    }

    @PostMapping ("/product-service")
    public String productServiceFallBackMethodPost() {
        return "Product Service Not Working";
    }

    @GetMapping("/order-service")
    public String orderServiceFallBackMethodGet() {
        return "Order Service Not Working";
    }

    @PostMapping("/order-service")
    public String orderServiceFallBackMethodPost() {
        return "Order Service Not Working";
    }
}
