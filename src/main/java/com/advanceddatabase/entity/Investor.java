package com.advanceddatabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Investor {

    @Id
    private int investorNumber;

    private String chiefContactOfficer;
    private String location;
    private String contactNumber;
    private double amountInvested;
}
