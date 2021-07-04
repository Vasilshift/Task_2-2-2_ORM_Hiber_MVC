package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ControllerCars {

    @GetMapping("/cars")
    public String viewCars(Model model, @RequestParam(value = "count", required = false, defaultValue = "4") int count) {
        List<Car> listCars = new CarService().getlistCars();
        List<Car> listCarsNumbers = (List<Car>) new CarService().getlistCars().stream().limit(count).collect(Collectors.toList());
        model.addAttribute("listCars", listCars);
        System.out.println(listCars);

        model.addAttribute("listCarsNumbers", listCarsNumbers.toString());

        return "cars";
    }
}
