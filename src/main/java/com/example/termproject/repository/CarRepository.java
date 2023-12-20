package com.example.termproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.termproject.entity.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, String>{
}
