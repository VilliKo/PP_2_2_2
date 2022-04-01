package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5", required = false) Integer count, ModelMap model) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", 3, "red"));
        cars.add(new Car("Lada", 2114, "white"));
        cars.add(new Car("KAMAZ", 3012, "orange"));
        cars.add(new Car("Opel", 17, "black"));
        cars.add(new Car("Fiat", 25, "yellow"));
        cars = carService.checkNumberOfElem(count, cars);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
