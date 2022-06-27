package com.example.demo.Service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Specialization;
@Service
public interface SpecializationService {

	
	public long saveSpecialization(Specialization spec);
	public List<Specialization> getAllSpecialization();
	public void removeSpecialization(long id);
	public Specialization getSpecialization(long id);
	public void updateSpecialization(Specialization spec);
}
