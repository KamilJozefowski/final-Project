package com.kodilla.backend.service;

import com.kodilla.backend.domain.Room;
import com.kodilla.backend.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DbService {
    private final RoomRepository repository;

    public List<Room> getAllRoom(){
        return repository.findAll();
    }

}
