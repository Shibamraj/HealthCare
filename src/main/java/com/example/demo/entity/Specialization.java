package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.metamodel.model.domain.IdentifiableDomainType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor

@Table(name="Spec_tab")
public class Specialization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Spec_id", length = 10, nullable = false, unique = true)
	private long SpecId;
	
	@Column(name="Spec_code", length=30, nullable=false, unique=true)
	private String SpecCode;
	
	@Column(name="Spec_addr", length=20, nullable=false, unique=true)
	 private String SpecAddress;


	
	

}
