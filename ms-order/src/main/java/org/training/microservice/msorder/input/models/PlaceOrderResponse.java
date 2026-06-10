package org.training.microservice.msorder.input.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaceOrderResponse {
    private String orderId;
    private Double amount;
    private String deliveryTime;
}
