package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
    CustomerDto saveCustomer(CustomerDto customerDto);
    void updateCustomer(UUID uuid,CustomerDto customerDto);
    void deleteCustomer(UUID uuid,CustomerDto customerDto);
}
