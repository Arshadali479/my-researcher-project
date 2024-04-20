/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * 
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.findmyproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.example.findmyproject.service.ResearcherJpaService;
import com.example.findmyproject.model.Project;
import com.example.findmyproject.model.Researcher;

@RestController
public class ResearcherController {

    @Autowired
    public ResearcherJpaService researcherJpaService;

    @GetMapping("/researchers")
    public ArrayList<Researcher> getResearchers() {
        return researcherJpaService.getResearchers();
    }

    @PostMapping("/researchers")
    public Researcher addResearcher(@RequestBody Researcher researcher) {
        return researcherJpaService.addResearcher(researcher);
    }

    @GetMapping("/researchers/{researcherId}")
    public Researcher getById(@PathVariable("researcherId") int researcherId) {
        return researcherJpaService.getById(researcherId);
    }

    @PutMapping("/researchers/{researcherId}")
    public Researcher updateResearcher(@PathVariable("researcherId") int researcherId,
            @RequestBody Researcher researcher) {
        return researcherJpaService.updateResearcher(researcherId, researcher);
    }

    @DeleteMapping("/researchers/{researcherId}")
    public void deleteResearcher(@PathVariable("researcherId") int researcherId) {
        researcherJpaService.deleteResearcher(researcherId);
    }

    @GetMapping("/researchers/{researcherId}/projects")
    public List<Project> getResearcherProject(@PathVariable("researcherId") int researcherId) {
        return researcherJpaService.getResearcherProject(researcherId);
    }
}