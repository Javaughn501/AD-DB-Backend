package com.advanceddatabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Beneficiary {

    @Id
    @ManyToOne
    @JoinColumn(name = "trn")
    private Scientist scientist;

    @Id
    private int beneficiaryId;

    private String firstName;
    private String lastName;
    private LocalDate dob;
}
