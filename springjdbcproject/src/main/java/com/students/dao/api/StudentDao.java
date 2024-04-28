package com.students.dao.api;

import com.students.entities.Students;

import java.util.List;

public interface StudentDao {
    Integer insertStudent(Students student);

    Integer updateStudent(Integer studentId, Students student);

    Integer deleteStudent(Integer studentId);

    List<Students> getAllStudent();

    Students getStudentById(Integer studentId);
}
