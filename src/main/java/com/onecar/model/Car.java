package com.onecar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
    private String make;
    private String model;
    private String vinNumber;
    private int year;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
