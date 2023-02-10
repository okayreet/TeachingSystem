package com.okayreet.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Student {
    @Id
    @SequenceGenerator(name = "student_id_sequence", sequenceName = "student_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_sequence")
    private Long id;
    private String first_name;
    private String last_name;
    private LocalDate date_of_birth;
    private Integer telephone_number;
    private String email;
    private String address_1;
    private String address_2;
    private String city;
    private String post_code;
//    @JsonIgnore
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "class_year_id")
//    private ClassYear classYear;
}
