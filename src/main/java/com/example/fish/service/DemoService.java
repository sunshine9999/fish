package com.example.fish.service;

import com.example.fish.model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemoService{

    public List<Demo> getAll() throws Exception;
    public Demo saveDemo(Demo demo) throws Exception;
    public Demo getById(String id) throws Exception;
    public void delDemo(String id) throws Exception;

}
