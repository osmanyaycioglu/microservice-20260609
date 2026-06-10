package org.training.microservice.msrestaurant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/restaurant/order")
public class RestaurantOrderRestController {

    @Value("${server.port}")
    private int port;

    public String reserve(OrderRequest orderRequestParam){
        return "1 saat - " + port;
    }
}
