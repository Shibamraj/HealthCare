package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Doctor;

public interface DoctorService {
	Long SaveDoctro(Doctor doc);
	void DeleteDoctor(Long id);
	void UpdateDoctor(Doctor doc);
	List<Doctor> ShowAll();
	Doctor EditDoctor(Long id);

}
