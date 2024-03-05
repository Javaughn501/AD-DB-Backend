package com.advanceddatabase.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Table(name = "Element")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long elementId;

    private String name;
    private String category;
    private LocalDate dateDiscovered;

    @ManyToOne
    @JoinColumn(name = "trn")
    private Scientist expertScientist;
}
