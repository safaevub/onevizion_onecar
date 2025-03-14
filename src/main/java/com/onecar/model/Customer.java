package com.onecar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;

    @OneToMany(mappedBy = "customer")
    private List<Car> cars;
}
