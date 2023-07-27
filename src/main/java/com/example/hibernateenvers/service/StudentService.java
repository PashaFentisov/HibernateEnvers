package com.example.hibernateenvers.service;

import com.example.hibernateenvers.entity.Student;
import com.example.hibernateenvers.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    @Transactional(readOnly = true)
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Transactional
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Transactional

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}
