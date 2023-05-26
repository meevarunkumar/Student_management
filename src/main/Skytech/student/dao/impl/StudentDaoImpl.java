package Skytech.student.dao.impl;

import Skytech.student.model.Student;
import Skytech.student.dao.StudentDao;
import Skytech.student.model.University;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String query = "insert into student( name, phoneNo, email, age , address) value(?,?,?,?,?)";
        int count = 0;
        try {
            count = jdbcTemplate.update(query, student.getName(), student.getPhoneNo(), student.getEmail(), student.getAge(), student.getAddress());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;

    }


    @Override
    public List<Student> getListOfStudent() {
        String query = "Select * from student";
        List<Student> studentList = null;
        try {
            studentList = jdbcTemplate.query(query, new StudentRowMapperImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }


    @Override
    public Student getStudentById(int id) {
        Student student = null;

        String sql = "SELECT * FROM student WHERE ID = ?";
        try {
            student = jdbcTemplate.queryForObject(sql, new StudentRowMapperImpl(), id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }


    @Override
    public int update(Student student) {
        int update = 0;
        String query = "update student set name =?, phoneNo=?, email=?, age =?, address=? where id =?";
        try {
            update = jdbcTemplate.update(query, student.getName(), student.getPhoneNo(), student.getEmail(), student.getAge(), student.getAddress(), student.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return update;
    }


    @Override
    public int delete(int id) {
        int delete = 0;
        String query = "delete  from student where id =? ";
        try {
            delete = jdbcTemplate.update(query, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return delete;
    }
}
