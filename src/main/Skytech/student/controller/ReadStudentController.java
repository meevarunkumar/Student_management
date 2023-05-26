package Skytech.student.controller;

import Skytech.student.model.Student;
import Skytech.student.model.University;
import Skytech.student.restuniversity.restservice.Impl.UnivesrityServiceImplRest;
import Skytech.student.service.Impl.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ReadStudentController {


    @Autowired
    @Qualifier("studentService")
    private StudentServiceImp serviceImp;
    @Autowired
    private UnivesrityServiceImplRest univesrityServiceImplRest;


    @GetMapping("/getStudentList")
    public ModelAndView getStudentList(ModelAndView modelAndView) {
        List<Student> studentList = serviceImp.getStudentList();
        modelAndView.addObject("studentList", studentList);
        modelAndView.setViewName("studentList");
        return modelAndView;
    }


    @GetMapping("/getbyid/{id}")
    public ModelAndView getStudentById(@PathVariable int id, ModelAndView modelAndView) {
        Student student = serviceImp.getStudentById(id);
        modelAndView.addObject(student);
        modelAndView.setViewName("studentdata");
        return modelAndView;
    }


    @GetMapping("getbyid/index")
    public String index() {
        return "redirect:/index";
    }

    @GetMapping("getbyid/getStudentList")
    public String backToStudentList() {
        return "redirect:/getStudentList";
    }

    @GetMapping("/getbyid/updateForm/getback/{id}")
    public String backToStudentData(@PathVariable int id) {
        return "redirect:/getbyid/" + id;
    }

    @GetMapping("getbyid/updateForm/updateDetails")
    public String backToStudentUpdateForm(@RequestParam("id") int id) {
        return "redirect:/getbyid/updateForm/?id=" + id;
    }

//Rest API Codes
@ResponseBody
@GetMapping("/getStudentListData")
public List<Student> data(){
    return serviceImp.getStudentList();
}
}
