package com.hmtmcse.microservice.product.controllers;


import com.hmtmcse.microservice.product.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ApiProductV1Controller {

    @RequestMapping(value = "/list", produces = "application/json", method = RequestMethod.GET)
    public ResponseEntity<?> readList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product().name("RAM").id(1));
        products.add(new Product().name("SSD").id(2));
        products.add(new Product().name("Motherboard").id(3));
        products.add(new Product().name("Cooling Fan").id(4));
        products.add(new Product().name("Processor").id(5));
        return ResponseEntity.ok(products);
    }

}
