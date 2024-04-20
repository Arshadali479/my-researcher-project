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

import com.example.findmyproject.service.ProjectJpaService;
import com.example.findmyproject.model.Project;
import com.example.findmyproject.model.Researcher;

@RestController
public class ProjectController {

    @Autowired
    public ProjectJpaService projectJpaService;

    @GetMapping("/researchers/projects")
    public ArrayList<Project> getProjects() {
        return projectJpaService.getProjects();
    }

    @PostMapping("/researchers/projects")
    public Project addProject(@RequestBody Project project) {
        return projectJpaService.addProject(project);
    }

    @GetMapping("/researchers/projects/{projectId}")
    public Project getById(@PathVariable("projectId") int projectId) {
        return projectJpaService.getById(projectId);
    }

    @PutMapping("/researchers/projects/{projectId}")
    public Project updateProject(@PathVariable("projectId") int projectId, @RequestBody Project project) {
        return projectJpaService.updateProject(projectId, project);
    }

    @DeleteMapping("/researchers/projects/{projectId}")
    public void deleteProject(@PathVariable("projectId") int projectId) {
        projectJpaService.deleteProject(projectId);
    }

    @GetMapping("/projects/{projectId}/researchers")
    public List<Researcher> getProjectResearcher(@PathVariable("projectId") int projectId) {
        return projectJpaService.getProjectResearcher(projectId);
    }
}