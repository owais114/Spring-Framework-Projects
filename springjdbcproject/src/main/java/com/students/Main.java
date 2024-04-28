package com.students;

import com.students.configuration.Config;
import com.students.dao.api.StudentDao;
import com.students.dao.impl.StudentDaoImpl;
import com.students.entities.Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Spring JDBC Project (CRUD Operation)");

//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        StudentDao studentDao = context.getBean("studentDaoImpl", StudentDaoImpl.class);

//        insert student record
//        Students student = new Students();
//        student.setUsername("aisha");
//        student.setEmail("aisha@gmail.com");
//        student.setGender("female");
//        Integer success = studentDao.insertStudent(student);
//        if (success > 0) {
//            System.out.println("data inserted successfully");
//        } else {
//            System.out.println("data not inserted successfully");
//        }

//        update student record
//        Integer studentId = 1;
//        Students student = new Students();
//        student.setUsername("owais12");
//        student.setEmail("owais12@gmail.com");
//        student.setGender("male");
//        Integer success = studentDao.updateStudent(studentId,student);
//        if (success > 0) {
//            System.out.println("data updated successfully");
//        } else {
//            System.out.println("data not updated successfully");
//        }

//        delete student record
//        Integer studentId = 1;
//        Integer success = studentDao.deleteStudent(studentId);
//        if (success > 0) {
//            System.out.println("data deleted successfully");
//        } else {
//            System.out.println("data not deleted successfully");
//        }

//        get all student record
//        List<Students> student = studentDao.getAllStudent();
//        for (Students s : student) {
//            System.out.println(s.getId() + " " + s.getUsername() + " " + s.getEmail() + " " + s.getGender());
//        }

//        get student record by studentid
//        Integer studentId = 2;
//        Students student = studentDao.getStudentById(studentId);
//        System.out.println(student.getId() + " " + student.getUsername() + " " + student.getEmail() + " " + student.getGender());
    }
}