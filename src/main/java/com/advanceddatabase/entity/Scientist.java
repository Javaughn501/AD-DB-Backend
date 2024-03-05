package com.advanceddatabase.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Scientist {

    @Id
    @Column(name = "TRN")
    private Long trn;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "DOB")
    private LocalDate dob;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "Role")
    private String role;

    @Column(name = "Salary")
    private Double salary;

    @ManyToOne
    @JoinColumn(name = "mentor_ID")
    private Scientist mentor;

    @OneToMany(mappedBy = "scientist")
    private List<MobileNumber> mobileNumbers;

}
