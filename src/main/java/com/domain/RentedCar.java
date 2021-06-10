package com.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class RentedCar {

    @Id
    private Long id;

    @Column(name = "Rented_On")
    private LocalDate rentedOn;

    @Column(name = "ReturnDate")
    private LocalDate returnDate;

    @ManyToOne
    @MapsId
    private Car car;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;

    public RentedCar(Car car) {
        this.car = car;
    }
}
