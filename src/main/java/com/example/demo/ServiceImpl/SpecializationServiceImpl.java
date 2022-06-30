package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service.SpecializationService;
import com.example.demo.entity.Specialization;
import com.example.demo.repository.SpecializationRepository;


public  class SpecializationServiceImpl implements SpecializationService {

	@Autowired
	private SpecializationRepository repo;

	@Override
	public long saveSpecialization(Specialization spec) {
		spec=repo.save(spec);
		return spec.getId();
	}

	@Override
	public List<Specialization> getAllSpecialization() {
		
		return repo.findAll();
	}

	@Override
	public void removeSpecialization(long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Specialization getSpecialization(long id) {
		Optional<Specialization> opt=repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
		return null;
	}}

	@Override
	public void updateSpecialization(Specialization spec) {
		repo.save(spec);
		
	}

	
}
