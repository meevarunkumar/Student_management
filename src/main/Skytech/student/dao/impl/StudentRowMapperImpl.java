package Skytech.student.dao.impl;

import Skytech.student.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapperImpl implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setPhoneNo(rs.getString(3));
        student.setEmail(rs.getString(4));
        student.setAge(rs.getInt(5));
        student.setAddress(rs.getString(6));
        return student;
    }
}
