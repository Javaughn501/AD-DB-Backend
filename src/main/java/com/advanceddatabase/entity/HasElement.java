package com.advanceddatabase.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Has_Element")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HasElement {

    @Id
    @ManyToOne
    @JoinColumn(name = "elementId")
    private Element element;

    @Id
    @ManyToOne
    @JoinColumn(name = "formulaId")
    private Formula formula;

    private int quantity;
}
