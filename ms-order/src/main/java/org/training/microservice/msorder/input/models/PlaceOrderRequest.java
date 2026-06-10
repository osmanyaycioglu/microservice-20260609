package org.training.microservice.msorder.input.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PlaceOrderRequest {
    @Size(min = 3,max = 15)
    @NotBlank
    private String customerName;
    @NotEmpty
    private String customerNumber;
    @NotBlank
    private String mealName;
    @NotNull
    private Double mealPortion;
}
