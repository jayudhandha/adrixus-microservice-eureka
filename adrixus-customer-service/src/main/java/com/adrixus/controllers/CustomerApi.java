package com.adrixus.controllers;

import com.adrixus.models.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface CustomerApi {
    ResponseEntity<Void> createCustomer(@RequestBody Customer customerModel);

    ResponseEntity<Customer> getCustomer(@PathVariable String customerId);
}
