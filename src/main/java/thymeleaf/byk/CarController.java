package thymeleaf.byk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/carList")
    public String getCars(Model model) {
        Car car1 = new Car("Mercedes", "G55");
        Car car2 = new Car("Tesla", "Model S");
        Car car3 = new Car("Fiat", "Uno");
        Car car4 = new Car("Lada", "Kalina");
        List<Car> cars = new ArrayList<Car>();
        cars = Arrays.asList(car1, car2, car3, car4);
        model.addAttribute("cars", cars);
        return "carList";
    }
}
