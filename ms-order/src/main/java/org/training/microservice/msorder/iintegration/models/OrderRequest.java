package org.training.microservice.msorder.iintegration.models;

import lombok.Data;

@Data
public class OrderRequest {
    private String orderId;
    private String mealName;
    private String mealPortion;
}
