package com.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    private Long orderId;

    @Column(name = "Order_Created")
    private LocalDate createdOn;

    @Column(name = "Game_Rented_Till")
    private LocalDate rentedTill;

    @ManyToOne(cascade = CascadeType.MERGE)
    private User user;

    @OneToMany(mappedBy = "Order")
    private List<Car> cars;

    public Order(User user, List<Car> cars) {
        this.user = user;
        this.cars = cars;
    }
}
