package com.example.fish.repository;

import com.example.fish.model.SysDragon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDragonDao extends JpaRepository<SysDragon,String> {
}
