/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.findmyproject.repository;

import java.util.*;
import com.example.findmyproject.model.Project;
import com.example.findmyproject.model.Researcher;

public interface ProjectRepository {
    ArrayList<Project> getProjects();

    Project addProject(Project project);

    Project getById(int projectId);

    Project updateProject(int projectId, Project project);

    void deleteProject(int projectId);

    List<Researcher> getProjectResearcher(int projectId);
}