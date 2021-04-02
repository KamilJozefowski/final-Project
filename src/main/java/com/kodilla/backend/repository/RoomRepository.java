package com.kodilla.backend.repository;

import com.kodilla.backend.domain.Room;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{

    List<Room> findAll();
}
