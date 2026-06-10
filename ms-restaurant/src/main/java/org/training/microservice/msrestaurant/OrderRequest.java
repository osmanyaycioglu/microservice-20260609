package org.training.microservice.msrestaurant;

import lombok.Data;

@Data
public class OrderRequest {
    private String mealName;
    private String mealPortion;
}
