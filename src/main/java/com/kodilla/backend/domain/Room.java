package com.kodilla.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "room")
public class Room {
    private Long id;
    private Long roomNumber;
    private String roomType;
    private Integer maxSleeps;
    private Double price;
    private Bed bed;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    @Column(name = "room_number")
    @UniqueElements
    public Long getRoomNumber() {
        return roomNumber;
    }

    @Column(name = "ROOM_TYPE")
    public String getRoomType() {
        return roomType;
    }

    @Column(name = "max_sleeps")
    public Integer getMaxSleeps() {
        return maxSleeps;
    }

    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "BED_ID")
    public Bed getBed() {
        return bed;
    }
}
