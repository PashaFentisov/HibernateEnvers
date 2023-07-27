package com.example.hibernateenvers.controller;

import com.example.hibernateenvers.entity.Student;
import com.example.hibernateenvers.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentRestController {
    private final StudentService studentService;
    @GetMapping
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @PostMapping
    public Student postStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PatchMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        student.setId(id);
        return studentService.updateStudent(student);
    }

}
