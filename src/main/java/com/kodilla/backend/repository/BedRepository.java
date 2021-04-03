package com.kodilla.backend.repository;

import com.kodilla.backend.domain.Bed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BedRepository extends CrudRepository<Bed, Long> {

}

