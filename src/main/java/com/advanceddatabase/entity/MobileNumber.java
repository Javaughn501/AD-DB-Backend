package com.advanceddatabase.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class MobileNumber {

    @Id
    @Column(name = "mobile_numbers")
    private String mobileNumber;

    @ManyToOne
    @JoinColumn(name = "TRN")
    private Scientist scientist;

}
