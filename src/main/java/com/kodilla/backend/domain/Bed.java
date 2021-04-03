package com.kodilla.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "bed")
public class Bed {

    public Bed(Integer singleBed, Integer doubleBed) {
        this.singleBed = singleBed;
        this.doubleBed = doubleBed;
    }

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(name = "single_bed")
    private Integer singleBed;

    @NotNull
    @Column(name = "double_bed")
    private Integer doubleBed;

}
