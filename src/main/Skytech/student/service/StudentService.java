package Skytech.student.service;

import Skytech.student.model.Student;
import Skytech.student.model.University;

import java.util.List;

public interface StudentService {
    public int insertStudent(Student student);

    public List<Student> getStudentList();

    public Student getStudentById(int id);

    public int updateStudent(Student student);

    public int deleteStudent(int id);
//    public int insertUniversity();





}
