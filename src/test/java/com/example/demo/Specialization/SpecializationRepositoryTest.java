package com.example.demo.Specialization;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;

import com.example.demo.entity.Specialization;
import com.example.demo.repository.SpecializationRepository;

@DataJpaTest(showSql=true)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)

public class SpecializationRepositoryTest {
	
	
	@Autowired
	private SpecializationRepository repo;
	
	
	@Test
	@Order(1)
	public void testspecCreate() {
		Specialization spec=new Specialization(1,"CDRl","Cardiology","This is Expart in bloood Vesale");
		spec=repo.save(spec);
		//assertNotNull(spec.getId(),"ID should not be null");
		
	
	

}}
