package com.advanceddatabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invests {

    @Id
    @ManyToOne
    @JoinColumn(name = "trn")
    private Scientist scientist;

    @Id
    @ManyToOne
    @JoinColumn(name = "formulaId")
    private Formula formula;

    @Id
    @ManyToOne
    @JoinColumn(name = "investorCode")
    private Investor investor;

    private Date startFundingDate;
    private Date endFundingDate;
}
