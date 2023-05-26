package Skytech.student.dao;

import Skytech.student.model.Student;
import Skytech.student.model.University;

import java.util.List;

public interface StudentDao {

    public int insert(Student student);

    public List<Student> getListOfStudent();

    public Student getStudentById(int id);

    public int update(Student student);

    public int delete(int id);
//


}
