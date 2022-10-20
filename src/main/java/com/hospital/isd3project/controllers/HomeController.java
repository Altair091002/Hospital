package com.hospital.isd3project.controllers;

import com.hospital.isd3project.repos.DiseasesRepo;
import com.hospital.isd3project.repos.PeopleRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final DiseasesRepo diseasesRepos;
    private final PeopleRepo peopleRepos;

    public HomeController(DiseasesRepo diseasesRepos, PeopleRepo peopleRepos) {
        this.diseasesRepos = diseasesRepos;
        this.peopleRepos = peopleRepos;
    }

    @GetMapping("/")
    public String getHome(){
        return "index";
    }
    @GetMapping("/staff")
    public String staff(Model model){
        model.addAttribute("staffs", peopleRepos.findAll());
        return "staff";
    }

    @GetMapping("/diseas")
    public String diseas(Model model){
        model.addAttribute("diseases", diseasesRepos.findAll());
        return "diseas";
    }
}
