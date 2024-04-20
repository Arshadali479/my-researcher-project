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

public interface ResearcherRepository {
    ArrayList<Researcher> getResearchers();

    Researcher addResearcher(Researcher researcher);

    Researcher getById(int researcherId);

    Researcher updateResearcher(int researcherId, Researcher researcher);

    void deleteResearcher(int researcherId);

    List<Project> getResearcherProject(int researcherId);
}