package org.training.microservice.msorder.iintegration;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.training.microservice.msorder.iintegration.models.OrderRequest;
import org.training.microservice.msorder.input.models.PlaceOrderRequest;

@Component
public class RestaurantIntegration {

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private RestTemplate restTemplate;

    public String reserve(PlaceOrderRequest orderRequestParam) {
        OrderRequest orderRequestLoc = new OrderRequest();
        orderRequestLoc.setOrderId("34789erbr");
        orderRequestLoc.setMealName(orderRequestParam.getMealName());
        orderRequestLoc.setMealPortion(orderRequestLoc.getMealPortion());
        String resultStringLoc = restTemplate.postForObject("http://MS-RESTAURANT/api/v1/restaurant/order/reserve",
                                                            orderRequestLoc,
                                                            String.class);
        return resultStringLoc;
    }

}
