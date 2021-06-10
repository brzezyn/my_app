package com.repository;

import com.domain.RentedCar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface RentedCarRepository extends CrudRepository <RentedCar, Long> {

    @Override
    List<RentedCar> findAll();

    @Override
    RentedCar save(RentedCar rentedCar);

    @Override
    Optional<RentedCar> findById(Long carId);

    @Override
    void deleteById(Long carId);
}
