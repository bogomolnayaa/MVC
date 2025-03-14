package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping(value = "/cars")
public class CarController {

    private CarService carService;

    @Autowired
    CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getSomeCars(@RequestParam(name = "count", required = false, defaultValue = "5") int num, ModelMap model) {
        model.addAttribute("someCars", carService.getSomeCars(num));
        return "cars";
    }
}
