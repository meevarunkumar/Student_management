package Skytech.student.restuniversity.service;

import Skytech.student.model.University;

import java.util.List;

public interface UniversityService {
    public List<University> getAllUniversity();
    public int insertUniversity(University university);
}
