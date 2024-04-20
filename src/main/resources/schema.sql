create table project (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    budget DOUBLE
);

create table researcher(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    specialization TEXT
);

create table researcher_project(
    researcherId INTEGER,
    projectId INTEGER,
    PRIMARY KEY(researcherId, projectId),
    FOREIGN KEY (researcherId) REFERENCES researcher(id),
    FOREIGN KEY (projectId) REFERENCES project(id)
);