package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Optional;

@Controller
public class CarController {

    @Autowired
    private final CarService carService;

    public CarController(CarServiceImpl service) {
        this.carService = service;
    }

    @GetMapping("/cars")
    public String Showcars(@RequestParam(value = "count", required = false)Optional<Integer> count, Model model) {
        model.addAttribute("cars", carService.getCars(count.orElse(0)));
        return "cars";
    }
}
