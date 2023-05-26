package Skytech.student.controller;

import Skytech.student.model.University;
import Skytech.student.restuniversity.dao.UniversityDao;
import Skytech.student.restuniversity.restservice.Impl.UniversityStrategy;
import Skytech.student.restuniversity.service.UniversityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ReadUniversityController {
    @Autowired
    UniversityStrategy universityStrategy;
    @Autowired
    UniversityServiceImpl universityServiceImpl;

    @GetMapping("/getUniversityList")
    public ModelAndView getUpdateStudentList(ModelAndView modelAndView) {

        List<University> universities = universityServiceImpl.getAllUniversity();
        modelAndView.addObject("universities", universities);
        modelAndView.setViewName("universityList");
        return modelAndView;
    }

    @GetMapping("/insertUniversity")
    @ResponseBody
    public String insertUniversity() {
        universityStrategy.saveUniversity();
        return "Inserted Successfully";
    }
}
