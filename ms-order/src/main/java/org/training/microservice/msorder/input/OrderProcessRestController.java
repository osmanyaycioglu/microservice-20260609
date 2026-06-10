package org.training.microservice.msorder.input;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.training.microservice.msorder.input.models.PlaceOrderRequest;
import org.training.microservice.msorder.input.models.PlaceOrderResponse;
import org.training.microservice.msorder.services.OrderProcessService;

@RestController
@RequestMapping("/api/v1/order/process")
@RequiredArgsConstructor
public class OrderProcessRestController {
    private final OrderProcessService orderProcessService;


    @PostMapping("/place")
    public PlaceOrderResponse place(@Valid @RequestBody PlaceOrderRequest placeOrderRequestParam) {
        return orderProcessService.place(placeOrderRequestParam);
    }

}
