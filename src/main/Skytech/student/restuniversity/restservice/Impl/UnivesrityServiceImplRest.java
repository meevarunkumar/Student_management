package Skytech.student.restuniversity.restservice.Impl;

import Skytech.student.restuniversity.restservice.UniversityServiceRest;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class UnivesrityServiceImplRest implements UniversityServiceRest {


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List getAllUniversity() {
       List<Map<String, String>> universities= getRestTemplate().getForObject(UniversityServiceRest.REST_UNIVERSITIES, List.class);
        return universities;

    }
    @Override
    public List getAllUniversity2() {
    ResponseEntity<List> entity = getRestTemplate().getForEntity(UniversityServiceRest.REST_UNIVERSITIES, List.class);

       return  entity.getBody();

    }



    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}

