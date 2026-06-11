package org.training.microservice.msorder.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.microservice.msorder.iintegration.RestaurantIntegration;
import org.training.microservice.msorder.input.models.PlaceOrderRequest;
import org.training.microservice.msorder.input.models.PlaceOrderResponse;

@Service
public class OrderProcessService {

    @Autowired
    private RestaurantIntegration restaurantIntegration;

    public PlaceOrderResponse place(PlaceOrderRequest placeOrderRequestParam) {
        String reserveLoc = restaurantIntegration.reserve(placeOrderRequestParam);
        return new PlaceOrderResponse("236123", 3000D, reserveLoc);
    }

}
