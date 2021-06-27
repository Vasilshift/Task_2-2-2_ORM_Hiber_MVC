package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloControllerCars {
    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("I'm controller Cars");

        model.addAttribute("messages", messages);
        return "index";
    }

    List<Car> listCar = new ArrayList();
    Car Car1 = new Car("Tesla", "5", "190");
    Car Car2 = new Car("Tesla", "6", "200");
    Car Car3 = new Car("Tesla", "7", "210");
    Car Car4 = new Car("BMW", "8", "220");
    Car Car5 = new Car("Toyota", "9", "230");




}
