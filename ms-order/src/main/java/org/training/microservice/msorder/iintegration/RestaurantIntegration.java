package org.training.microservice.msorder.iintegration;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.training.microservice.msorder.input.models.PlaceOrderRequest;

@Component
public class RestaurantIntegration {

    public String reserve(PlaceOrderRequest orderRequestParam){
        return null;
    }

}
