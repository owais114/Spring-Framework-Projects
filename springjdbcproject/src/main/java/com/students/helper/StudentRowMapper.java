package com.students.helper;

import com.students.entities.Students;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Students> {
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
