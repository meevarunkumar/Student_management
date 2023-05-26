package Skytech.student.dao.impl;

import Skytech.student.model.University;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UniversityRowMapper implements RowMapper<University> {

    @Override
    public University mapRow(ResultSet rs, int rowNum) throws SQLException {
        University university = new University();
        university.setId(rs.getInt(1));
        university.setCountry(rs.getString(2));
        university.setAlpha_two_code(rs.getString(3));
        university.setName(rs.getString(4));
        return university;
    }
}
