package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> checkNumberOfElem (Integer count, List<Car> cars) {
        if (count >= cars.size()) {return cars;}
        cars.removeAll(cars.subList(count, cars.size()));
        return cars;
    }
}