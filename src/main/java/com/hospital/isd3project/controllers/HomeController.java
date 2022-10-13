package com.hospital.isd3project.controllers;

import com.hospital.isd3project.repos.DiseasesRepos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final DiseasesRepos diseasesRepos;

    public HomeController(DiseasesRepos diseasesRepos) {
        this.diseasesRepos = diseasesRepos;
    }

    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    @GetMapping("/diseas")
    public String diseas(Model model){
        model.addAttribute("diseases", diseasesRepos.findAll());
        return "diseas";
    }
}
