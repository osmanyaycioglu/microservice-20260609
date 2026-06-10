package org.training.microservice.msorder.services;

import org.springframework.stereotype.Service;
import org.training.microservice.msorder.input.models.PlaceOrderRequest;
import org.training.microservice.msorder.input.models.PlaceOrderResponse;

@Service
public class OrderProcessService {

    public PlaceOrderResponse place(PlaceOrderRequest placeOrderRequestParam) {
        return new PlaceOrderResponse("236123", 3000D, "1 saat");
    }

}
