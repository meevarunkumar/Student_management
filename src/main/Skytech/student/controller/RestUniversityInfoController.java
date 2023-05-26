package Skytech.student.controller;


import Skytech.student.restuniversity.restservice.Impl.UnivesrityServiceImplRest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class RestUniversityInfoController {

    @Autowired
    private UnivesrityServiceImplRest univesrityServiceImplRest;

    @GetMapping(value = "/getUniversity")
    public List getUniversity() {
        return univesrityServiceImplRest.getAllUniversity();
    }
    @GetMapping("/getUniversity2")
    public List getUniversity2() {
        return univesrityServiceImplRest.getAllUniversity2();
    }

}
