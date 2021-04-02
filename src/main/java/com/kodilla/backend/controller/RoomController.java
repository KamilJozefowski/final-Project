package com.kodilla.backend.controller;

import com.kodilla.backend.domain.Bed;
import com.kodilla.backend.domain.Room;
import com.kodilla.backend.domain.RoomDto;
import com.kodilla.backend.mapper.RoomMapper;
import com.kodilla.backend.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("room")
@RequiredArgsConstructor
public class RoomController {

    private final DbService dbService;
    private final RoomMapper roomMapper;

    @GetMapping()
    public List<RoomDto> getRooms() {
        List<Room> rooms = dbService.getAllRoom();
        return roomMapper.mapToRoomDtoList(rooms);
    }

    @GetMapping("/{roomId}")
    public RoomDto getRoom(Long roomId) throws RoomNotFoundException {
        return new RoomDto(1L, 1L, "Superior Double", new Bed(0, 2), 4, 220D);
    }

    @DeleteMapping("/{roomId}")
    public void deleteRoom(Long roomId) {

    }

    @PutMapping("")
    public RoomDto updateRoom(Long roomId) {
        return new RoomDto(1L, 1L, "Superior Double", new Bed(1, 1), 3, 220D);
    }

    @PostMapping(value = "")
    public void createRoom(RoomDto roomDto) {

    }
}
