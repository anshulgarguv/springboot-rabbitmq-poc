package com.javatechie.rabbitmq.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatus {

    
    private Order order;
    private String status;//progress,completed
    private String message;
    public OrderStatus(Order order2, String string, String string2) {
        this.order = order2;
        this.status = string;
        this.message = string2;
    }
}