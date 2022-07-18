package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Specialization;

public interface SpecializationRepository extends JpaRepository<Specialization,Long> {

	@Query("SELECT count(SpecCode)from Specialization where SpecCode=:SpecCode")
 Integer getSpecCode(String SpecCode);

	@Query("SELECT count (SpecCode) from Specialization where SpecCode=:specCode AND id!=:id")
	Integer getSpecCodeedit(String SpecCode);
	
	
	
}
