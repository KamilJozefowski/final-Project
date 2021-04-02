package com.kodilla.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "room")
public class Room {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "room_number")
    @UniqueElements
    private Long roomNumber;

    @Column(name = "room_type")
    private String roomType;

    private Bed beds;

    @Column(name = "max_sleeps")
    private Integer maxSleeps;

    @Column(name = "price")
    private Double price;
}
