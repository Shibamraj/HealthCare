package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Specialization;

public interface ISpecializationService {
	
	
	public Long SaveSpecialization(Specialization spec);
	public List<Specialization> ShowAll();
	public void DeleteSpecialization(Long id);
	public Specialization EditSpecialization(Long id);
	public void UpdateSpecialization(Specialization spec);

}
