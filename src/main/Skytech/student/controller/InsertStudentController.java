package Skytech.student.controller;

import Skytech.student.model.Student;
import Skytech.student.restuniversity.restservice.Impl.UniversityStrategy;
import Skytech.student.restuniversity.restservice.Impl.UnivesrityServiceImplRest;
import Skytech.student.service.Impl.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class InsertStudentController {

    @Autowired
    @Qualifier("studentService")
    private StudentServiceImp serviceImp;

    @Autowired
    private UniversityStrategy universityStrategy;

    @Autowired
    UnivesrityServiceImplRest univesrityServiceImplRest;

    @RequestMapping({"/", "home"})
    public String index() {
        return "home";
    }

    @RequestMapping("/form")
    public String home() {
        return "form";
    }


    @PostMapping("/registeredSuccess")
    public ModelAndView submit(@RequestParam("name") String name,
                               @RequestParam("phoneNo") String phoneNo,
                               @RequestParam("email") String email,
                               @RequestParam("age") int age,
                               @RequestParam("address") String address,
                               ModelAndView model) {
        Student student = new Student();
        student.setName(name);
        student.setPhoneNo(phoneNo);
        student.setEmail(email);
        student.setAge(age);
        student.setAddress(address);
        System.out.println(student);
        serviceImp.insertStudent(student);
        model.addObject(student);
        model.setViewName("submitForm");
        return model;
    }



}
