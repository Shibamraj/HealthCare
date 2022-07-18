package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service.ISpecializationService;
import com.example.demo.entity.Specialization;
import com.example.demo.repository.SpecializationRepository;
@Service
public class SpecializationServiceImpl implements ISpecializationService {

	@Autowired
	private SpecializationRepository repo;
	
	@Override
	public Long SaveSpecialization(Specialization spec) {
		
	spec=repo.save(spec);
		return spec.getId();//spec.getId();
	}

	@Override
	public List<Specialization> ShowAll() {
	List<Specialization>	list= repo.findAll();
		return list;
	}

	@Override
	public void DeleteSpecialization(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Specialization EditSpecialization(Long id) {
Optional<Specialization> opt=		repo.findById(id);
if(opt.isPresent())
{
return opt.get();
}else {

return null;
	}}

	@Override
	public void UpdateSpecialization(Specialization spec) {
	  repo.save(spec);
		
	}

}
