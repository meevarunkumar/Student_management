package Skytech.student.restuniversity.dao;

import Skytech.student.dao.impl.UniversityRowMapper;
import Skytech.student.model.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UniversityDaoInpl implements UniversityDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertUniversity(University university) {


        String query = "insert into university( country ,  alpha_two_code, name ) value(?,?,?)";
        int count = 0;
        try {
            count = jdbcTemplate.update(query, university.getCountry(), university.getAlpha_two_code(), university.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;

    }

    @Override
    public List<University> getAllUniversity() {
        String query = "Select * from university";
        List<University> universities = null;
        try {
            universities = jdbcTemplate.query(query, new UniversityRowMapper());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return universities;

    }
}
