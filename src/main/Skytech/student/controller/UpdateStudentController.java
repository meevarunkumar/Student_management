package Skytech.student.controller;

import Skytech.student.model.Student;
import Skytech.student.service.Impl.StudentServiceImp;
import Skytech.student.validator.StudentValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;


@Controller
public class UpdateStudentController {

    @Autowired
    @Qualifier("studentService")
    private StudentServiceImp serviceImp;
    @Autowired
   private  StudentValidator studentValidator;


    @GetMapping("/getbyid/updateForm")
    public ModelAndView updateDetails(@RequestParam("id") int id, ModelAndView modelAndView) {
        Student student = serviceImp.getStudentById(id);
        modelAndView.addObject(student);
        modelAndView.setViewName("update");

        return modelAndView;
    }

    @PostMapping("/getbyid/updateForm/updateDetails")
    public ModelAndView updateSubmit(@Valid @ModelAttribute Student student, BindingResult result, ModelAndView model) {

        studentValidator.validate(student, result);
        if (result.hasErrors()) {
            model.setViewName("update");
            return model;
        }

        serviceImp.updateStudent(student);
        model.setViewName("redirect:/getStudentList");
        return model;
    }


}
