package com.example.fish.repository;

import com.example.fish.model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoDao extends JpaRepository<Demo,String> {
}
