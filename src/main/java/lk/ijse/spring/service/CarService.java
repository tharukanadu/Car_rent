package lk.ijse.spring.service;

import lk.ijse.spring.entity.Car;

import java.util.List;

public interface CarService {
    public void saveCar(Car entity);
    public void deleteCar(String id);
    public void updateCar(Car entity);
    public Car searchCar(String id);
    public List<Car> getAllCar();
}
