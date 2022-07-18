package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Service.DoctorService;
import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepository repo;

	
	public Long SaveDoctro(Doctor doc) {

            doc=repo.save(doc);
		return doc.getId();
	}


	@Override
	public void DeleteDoctor(Long id) {
		
		      repo.deleteById(id);
		
	}


	@Override
	public void UpdateDoctor(Doctor doc) {
		repo.save(doc);
		
	}


	@Override
	public List<Doctor> ShowAll() {
	List<Doctor> list=	    repo.findAll();
		return list;
	}


	@Override
	public Doctor EditDoctor(Long id) {
	Optional<Doctor> opt=repo.findById(id);
	
	if(opt.isPresent())
	{
		return opt.get();
	}else {
	
	
	
		return null;
	}}

}
