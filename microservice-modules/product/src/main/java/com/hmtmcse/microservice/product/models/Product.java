package com.hmtmcse.microservice.product.models;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class Product {
    public Integer id;
    public String name;
}
