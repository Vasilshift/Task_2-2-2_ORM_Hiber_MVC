package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Controller
public class HelloControllerCars {
    @GetMapping(value = "/cars")

    public String viewCars(Model model) {
        //int count = Integer.parseInt(request.getParameter("count"));
        //String[] cars = new String[] {"car1", "car2", "car3", "car4", "car5"};
        //model.addAttribute("cars", cars[count]);
        model.addAttribute("listCar", new CarService().getlistCars());
        return "cars";
    }

}
