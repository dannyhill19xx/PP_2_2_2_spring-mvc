package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Models.Cars;
import web.Service.CarsService;
import web.Service.CarsServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    CarsService carsService = new CarsServiceImpl();



    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "number", defaultValue = "5", required = false) int number, ModelMap model) {
        List<Cars> carsList = new ArrayList<>();
        carsList.add(new Cars(1, "Ford", 16));
        carsList.add(new Cars(2, "Chevrollete", 15));
        carsList.add(new Cars(3, "Bugatti", 14));
        carsList.add(new Cars(4, "Ferrari", 13));
        carsList.add(new Cars(5, "Volvo", 12));
        carsList = carsService.carsCount(carsList, number);
        model.addAttribute("cars", carsList);
        return "cars";
    }

}
