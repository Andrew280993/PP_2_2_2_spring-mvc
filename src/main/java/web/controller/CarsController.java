package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CarsController {
    @Autowired
    private final CarsDAO carsDAO;

    public CarsController(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    @RequestMapping("/cars")
    public String printWelcome(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("Cars", carsDAO.carsFilter(count));
        return "cars";
    }
}