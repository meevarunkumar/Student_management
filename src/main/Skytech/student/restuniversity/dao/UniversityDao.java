package Skytech.student.restuniversity.dao;

import Skytech.student.model.University;

import java.util.List;

public interface UniversityDao {
    public int insertUniversity(University university);
    public List<University> getAllUniversity();
}
