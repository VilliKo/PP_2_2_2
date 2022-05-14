package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 3, "red"));
        cars.add(new Car("Lada", 2114, "white"));
        cars.add(new Car("KAMAZ", 3012, "orange"));
        cars.add(new Car("Opel", 17, "black"));
        cars.add(new Car("Fiat", 25, "yellow"));
    }

    @Override
    public List<Car> checkNumberOfElem (Integer count) {
        if (count < 0) {
            return null;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}