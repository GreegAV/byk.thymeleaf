package thymeleaf.byk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    private List<Car> cars = new ArrayList<>();

    public CarController() {
        Car car1 = new Car("Mercedes", "G55");
        Car car2 = new Car("Tesla", "Model S");
        Car car3 = new Car("Fiat", "Uno");
        Car car4 = new Car("Lada", "Kalina");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
    }

    @GetMapping("/carList")
    public String getCars(Model model) {
        model.addAttribute("cars", cars);
        model.addAttribute("newCar", new Car());
        return "carList";
    }

    @PostMapping("/addCar")
    public String addCar(@ModelAttribute Car car) {
        cars.add(car);
        return "redirect:/carList";
    }

}
