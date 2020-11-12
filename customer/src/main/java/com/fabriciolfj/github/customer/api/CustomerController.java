package com.fabriciolfj.github.customer.api;

import com.fabriciolfj.github.customer.model.Customer;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    //@PreAuthorize("hasAuthority('SCOPE_TEST')")
    @GetMapping
    public Customer get() {
        return Customer.builder()
                .id(UUID.randomUUID().toString())
                .name("Test")
                .build();
    }
}
