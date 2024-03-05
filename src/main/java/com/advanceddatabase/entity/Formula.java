package com.advanceddatabase.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Formula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Formula_ID")
    private Long formulaId;

    @Column(name = "Descript")
    private String description;

    @Column(name = "Mol_Struct")
    private String molecularStructure;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "Industry_cat")
    private String industryCategory;

    @Column(name = "status")
    private String status;

}
