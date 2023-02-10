package com.okayreet.student;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/all")
    public ResponseEntity<?> getStudents() {
        log.info("request all students available");
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/{student_id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long student_id) {
        log.info("request student by ID: {}", student_id);
        return new ResponseEntity<>(studentService.getStudentById(student_id), HttpStatus.OK);
    }

    @GetMapping("/class/{class_year_id}")
    public ResponseEntity<?> getAllByClassYearId(@PathVariable Long class_year_id) {
        log.info("request student by ID: {}", class_year_id);
        return new ResponseEntity<>(studentService.getAllByClassYearId(class_year_id), HttpStatus.OK);
    }
}
