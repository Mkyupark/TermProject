package com.example.termproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.termproject.entity.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, String>{
	@Query("SELECT car FROM CarEntity car WHERE car.companyName = :companyName")
	List<CarEntity> findAllByCompanyName(@Param("companyName") String companyName);
}
