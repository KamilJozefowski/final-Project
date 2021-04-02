package com.kodilla.backend.controller;

import com.kodilla.backend.domain.Bed;
import com.kodilla.backend.domain.RoomDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("room")
public class RoomController {

    @GetMapping()
    public List<RoomDto> getRooms(){
        return new ArrayList<>();
    }

    @GetMapping("/{roomId}")
    public RoomDto getRoom (Long roomId) throws RoomNotFoundException{
        return new RoomDto(1L, 1L, "Superior Double", new Bed(0,2),4,220D);
    }

    @DeleteMapping("/{roomId}")
    public void deleteRoom (Long roomId){

    }

    @PutMapping("")
    public RoomDto updateRoom (Long roomId){
        return new RoomDto(1L, 1L, "Superior Double", new Bed(1,1),3,220D);
    }

    @PostMapping(value = "")
    public void createRoom(RoomDto roomDto){

    }
}
