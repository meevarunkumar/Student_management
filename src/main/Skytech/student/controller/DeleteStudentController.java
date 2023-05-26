package Skytech.student.controller;

import Skytech.student.service.Impl.StudentServiceImp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class DeleteStudentController {
    @Resource
    @Qualifier("studentService")
    private StudentServiceImp serviceImp;

    @GetMapping("/getbyid/delete")
    public ModelAndView delete(@RequestParam("id") int id, ModelAndView modelAndView) {
        serviceImp.deleteStudent(id);
        modelAndView.setViewName("redirect:/getStudentList");
        return modelAndView;
    }
}
