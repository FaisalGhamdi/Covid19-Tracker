package com.faisalghamdi.covid19tracker.controllers;

import com.faisalghamdi.covid19tracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

//    @Autowired
//    private CoronaVirusDataService coronaVirusDataService;
//
//    @GetMapping("/")
//    public String home(Model model){
//        model.addAttribute("locationStats", coronaVirusDataService.getAllStats());
//        return "home";
//    }
}
