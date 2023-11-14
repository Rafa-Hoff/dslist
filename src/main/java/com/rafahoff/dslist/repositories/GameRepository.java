package com.rafahoff.dslist.repositories;

import com.rafahoff.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
