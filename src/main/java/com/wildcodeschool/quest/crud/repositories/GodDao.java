package com.wildcodeschool.quest.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.quest.crud.entities.God;


@Repository
public interface GodDao extends JpaRepository<God, Long> {

}
