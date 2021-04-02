package com.kodilla.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {

    private Long id;

    private Long roomNumber;

    private String roomType;

    private Bed beds;

    private Integer maxSleeps;

    private Double price;
}
