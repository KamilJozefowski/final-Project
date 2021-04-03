package com.kodilla.backend.controller;

import com.kodilla.backend.domain.Bed;
import com.kodilla.backend.domain.Room;
import com.kodilla.backend.domain.RoomDto;
import com.kodilla.backend.mapper.RoomMapper;
import com.kodilla.backend.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("room")
@RequiredArgsConstructor
public class RoomController {

    private final DbService dbService;
    private final RoomMapper roomMapper;

    @GetMapping("")
    public List<RoomDto> getRooms() {
        List<Room> rooms = dbService.getAllRoom();
        return roomMapper.mapToRoomDtoList(rooms);
    }

    @GetMapping("/{roomId}")
    public RoomDto getRoom(@PathVariable Long roomId) throws RoomNotFoundException {
        return roomMapper.mapToRoomDto(dbService.getRoom(roomId).orElseThrow(RoomNotFoundException::new));
    }

    @PostMapping(value = "" , consumes = APPLICATION_JSON_VALUE)
    public void createRoom(@RequestBody RoomDto roomDto) {
        dbService.saveRoom(roomMapper.mapToRoom(roomDto));
    }

    @PutMapping("")
    public RoomDto updateRoom(@RequestBody RoomDto roomDto) {
        return roomMapper.mapToRoomDto(dbService.saveRoom(roomMapper.mapToRoom(roomDto)));
    }

    @DeleteMapping("/{roomId}")
    public void deleteRoom(@PathVariable Long roomId) {
        dbService.deleteRoom(roomId);
    }

}
