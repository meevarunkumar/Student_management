package Skytech.student.restuniversity.restservice.Impl;

import Skytech.student.dao.impl.StudentDaoImpl;
import Skytech.student.model.University;
import Skytech.student.restuniversity.service.UniversityService;
import Skytech.student.restuniversity.service.UniversityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class UniversityStrategy {
    @Autowired
    UniversityServiceImpl   universityServiceImpl;
    @Autowired
    UnivesrityServiceImplRest univesrityServiceImplRest;

    public void saveUniversity() {
        List<Map<String, Object>> allUniversity = univesrityServiceImplRest.getAllUniversity();
        for (Map<String, Object> map : allUniversity) {

            University university = new University();


            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                System.out.println("Key: " + key + ", Value: " + value);


                if (entry.getKey().equals("country") && entry.getValue()!=null) {
                    university.setCountry(entry.getValue().toString());
                }
                if (entry.getKey().equals("alpha_two_code") && entry.getValue()!=null) {
                    university.setAlpha_two_code(entry.getValue().toString());
                }
                if (entry.getKey().equals("name") && entry.getValue()!=null) {
                    university.setName(entry.getValue().toString());
                }
                if (entry.getKey().equals("state-province") && entry.getValue()!=null) {
                    university.setState_province(entry.getValue().toString());
                }
                if (entry.getKey().equals("domains") && entry.getValue()!=null) {
                    university.setDomains(( entry.getValue().toString()));
                }
                if (entry.getKey().equals("web-pages") && entry.getValue()!=null) {
                    university.setWebPages(( entry.getValue().toString()));
                }

            }
            universityServiceImpl.insertUniversity(university);
        }


    }


}
