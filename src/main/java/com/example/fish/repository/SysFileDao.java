package com.example.fish.repository;

import com.example.fish.model.SysFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysFileDao extends JpaRepository<SysFile,String> {
}