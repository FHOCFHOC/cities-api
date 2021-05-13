package com.corinto.citiesapi.staties.repositories;

import com.corinto.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}