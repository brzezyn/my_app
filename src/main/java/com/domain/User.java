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
public class User {

    @Id
    @GeneratedValue
    @Column(name = "User_ID")
    private Long userId;

    @Column(name = "User_Nickname", nullable = false)
    private String userNickname;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Name", nullable = false)
    private String userName;

    @Column(name = "Surname", nullable = false)
    private String userSurname;

    @Column(name = "User_Level", nullable = false)
    private String userLevel;

    @Column(name = "Email", nullable = false)
    private String userEmail;

    @Column(name = "Registered_On", nullable = false)
    private LocalDate registeredOn;

    @Column(name = "Status", nullable = false)
    private boolean isLogged;

    @OneToMany(mappedBy = "User")
    private List<RentedCar> rentedCars;

    @OneToMany(mappedBy = "User")
    private List<Order> orders;

    public User(Status userNickname, String userName, String userSurname, String userLevel, String userEmail, LocalDate registeredOn) {
        this.userNickname = userNickname;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userLevel = userLevel;
        this.userEmail = userEmail;
        this.registeredOn = registeredOn;
    }
}
