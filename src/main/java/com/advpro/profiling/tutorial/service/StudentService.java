package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        //using map and not loop n^2 we can achieve from 80,000ms to 356 ms
        List<StudentCourse> studentCourses = new ArrayList<>();
        List<Student> students = studentRepository.findAll();
        Map<Long, Student> studentMap = students.stream()
                .collect(Collectors.toMap(Student::getId, Function.identity()));
        List<StudentCourse> allStudentCourses = studentCourseRepository.findAll();
        allStudentCourses.forEach(studentCourse -> {
            Student student = studentMap.get(studentCourse.getStudent().getId());
            if (student != null) {
                StudentCourse newStudentCourse = new StudentCourse();
                newStudentCourse.setStudent(student);
                newStudentCourse.setCourse(studentCourse.getCourse());
                studentCourses.add(newStudentCourse);
            }
        });
        return studentCourses;
    }

    public Optional<Student> findStudentWithHighestGpa() {
        Student highestGpaStudent = studentRepository.getStudentWithHighestGpa().get(0);
        return Optional.ofNullable(highestGpaStudent);
    }


    public String joinStudentNames() {
        // According to the latest lecture i learn about stringbuilder this cut it from 2s to 336ms
        List<Student> students = studentRepository.findAll();
        StringBuilder resultBuilder = new StringBuilder();

        // Iterate over the list of students
        for (Student student : students) {
            // Append the name of each student to the StringBuilder
            resultBuilder.append(student.getName()).append(", ");
        }

        // Remove the trailing ", " and return the resulting string
        return resultBuilder.substring(0, resultBuilder.length() - 2);
    }
}

