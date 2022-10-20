package com.hospital.isd3project.controllers;

import com.hospital.isd3project.models.Diseases;
import com.hospital.isd3project.repos.DiseasesRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiseasesRestController {
    private final DiseasesRepo diseasesRepos;

    public DiseasesRestController(DiseasesRepo diseasesRepos) {
        this.diseasesRepos = diseasesRepos;
    }
    @GetMapping("/allDiseases")
    public List<Diseases> getDiseases(){
        return diseasesRepos.findAll();
    }
    @PostMapping("/setDiseases")
    public ResponseEntity<HttpStatus> create(@RequestBody Diseases diseases){
        diseasesRepos.save(diseases);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
