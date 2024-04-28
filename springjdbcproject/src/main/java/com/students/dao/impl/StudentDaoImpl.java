package com.students.dao.impl;

import com.students.dao.api.StudentDao;
import com.students.entities.Students;
import com.students.helper.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component()
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Integer insertStudent(Students student) {
        String query = "INSERT INTO students (username, email, gender) VALUES(?,?,?)";
        Integer success = this.jdbcTemplate.update(query, student.getUsername(), student.getEmail(), student.getGender());
        return success;
    }

    @Override
    public Integer updateStudent(Integer studentId, Students student) {
        String query = "UPDATE students set username = ?, email = ?, gender = ? WHERE id = ?";
        Integer success = this.jdbcTemplate.update(query, student.getUsername(), student.getEmail(), student.getGender(), studentId);
        return success;
    }

    @Override
    public Integer deleteStudent(Integer studentId) {
        String query = "DELETE FROM students WHERE id = ?";
        Integer success = this.jdbcTemplate.update(query, studentId);
        return success;
    }

    @Override
    public List<Students> getAllStudent() {
        String query = "SELECT * FROM students";
        List<Students> students = this.jdbcTemplate.query(query, new RowMapper<Students>() {
                    @Override
                    public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Students student = new Students();
                        student.setId(rs.getInt(1));
                        student.setUsername(rs.getString(2));
                        student.setEmail(rs.getString(3));
                        student.setGender(rs.getString(4));
                        return student;
                    }
                }
        );
        return students;
    }

    @Override
    public Students getStudentById(Integer studentId) {
        String query = "SELECT * FROM students WHERE id = ?";
        StudentRowMapper studentRowMapper = new StudentRowMapper();
        Students students = this.jdbcTemplate.queryForObject(query, studentRowMapper, studentId);
        return students;
    }

}
