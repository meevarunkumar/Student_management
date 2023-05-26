package Skytech.student.restuniversity.service;

import Skytech.student.model.University;
import Skytech.student.restuniversity.dao.UniversityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversityServiceImpl implements  UniversityService {
    @Autowired
    private UniversityDao universityDao;
    @Override
    public List<University> getAllUniversity() {
        return universityDao.getAllUniversity();
    }

    @Override
    public int insertUniversity(University university) {
        return universityDao.insertUniversity(university);
    }
}
