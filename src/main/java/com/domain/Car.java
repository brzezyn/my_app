package com.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue
    @Column(name = "Car_ID")
    private Long carId;

    @Column(name = "Brand", nullable = false)
    private String carBrand;

    @Column(name = "Model", nullable = false)
    private String carModel;

    @Column(name = "Type")
    private CarType carType;

    @Column(name = "Price", nullable = false)
    private double carPrice;

    @Column(name = "Available_Copies", nullable = false)
    private int carCopies;

    @OneToMany(mappedBy = "car")
    private List<RentedCar> rentedCars;

    @ManyToOne(cascade = CascadeType.ALL)
    private Order order;

}
