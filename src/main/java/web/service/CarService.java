package web.service;

import web.model.Car;
import java.util.List;

public interface CarService {
    public List<Car> checkNumberOfElem (Integer count, List<Car> cars);
}