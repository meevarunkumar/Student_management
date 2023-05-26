package Skytech.student.service.Impl;

import Skytech.student.model.Student;
import Skytech.student.dao.impl.StudentDaoImpl;
import Skytech.student.model.University;
import Skytech.student.service.StudentService;

import java.util.List;

public class StudentServiceImp implements StudentService {

    private StudentDaoImpl studentDao;


    public StudentServiceImp(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
    }

    /**
     * @param student
     * @return the number of rows inserted , updated or deleted
     */

    @Override
    public int insertStudent(Student student) {
        int count = studentDao.insert(student);
        return count;
    }

    @Override
    public List<Student> getStudentList() {

        return studentDao.getListOfStudent();
    }

    @Override
    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int deleteStudent(int id) {
        return studentDao.delete(id);
    }



//    @Override
//    public int insertUniversity( ) {
//        return studentDao.insertUniversity();
//    }
}
