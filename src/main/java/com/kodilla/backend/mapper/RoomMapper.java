package com.kodilla.backend.mapper;

import com.kodilla.backend.domain.Room;
import com.kodilla.backend.domain.RoomDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomMapper {
    public Room mapToRoom (final RoomDto roomDto){
        return new Room(
                roomDto.getId(),
                roomDto.getRoomNumber(),
                roomDto.getRoomType(),
                roomDto.getMaxSleeps(),
                roomDto.getPrice(),
                roomDto.getBeds());
    }

    public RoomDto mapToRoomDto(final Room room){
        return new RoomDto(
                room.getId(),
                room.getRoomNumber(),
                room.getRoomType(),
                room.getMaxSleeps(),
                room.getPrice(),
                room.getBed());
    }

    public List<RoomDto> mapToRoomDtoList(final List<Room> taskList){
        return taskList.stream()
                .map(this::mapToRoomDto)
                .collect(Collectors.toList());
    }
}
