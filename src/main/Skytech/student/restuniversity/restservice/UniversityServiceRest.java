package Skytech.student.restuniversity.restservice;

import java.util.List;


public interface UniversityServiceRest {
    public static final String REST_UNIVERSITIES= "http://universities.hipolabs.com/search?country=United+States";
    public List getAllUniversity();
    public List getAllUniversity2();
}
