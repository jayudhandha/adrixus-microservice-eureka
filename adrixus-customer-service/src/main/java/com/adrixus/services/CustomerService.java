package com.adrixus.services;

import com.adrixus.models.Customer;

public interface CustomerService {
    void createCustomer(Customer customerModel);

    Customer getCustomer(Long id);
}
