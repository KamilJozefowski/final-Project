package com.kodilla.backend.service;

import com.kodilla.backend.domain.Room;
import com.kodilla.backend.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbService {
    private final RoomRepository repository;

    public List<Room> getAllRoom(){
        return repository.findAll();
    }

    public Optional<Room> getRoom(final Long roomId){
        return repository.findById(roomId);
    }

    public void deleteRoom (final Long roomId){
        repository.deleteById(roomId);
    }

    public Room saveRoom(final Room room){
        return repository.save(room);
    }

}
