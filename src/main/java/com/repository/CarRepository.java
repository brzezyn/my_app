package com.repository;

import com.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    @Override
    List<Car> findAll();

    @Override
    Car save(Car car);

    @Override
    Optional<Car> findById(Long carId);

    @Override
    void deleteById(Long carId);
}
