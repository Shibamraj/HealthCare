package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Doc_tab")
@Data
@AllArgsConstructor

public class Doctor {

	@Id
	@Column(name="doc_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="doc_name", length = 10, nullable = false,unique = true)
	private String name;
	
	@Column(name="Doc_Addr", length = 23, nullable = false, unique=true)
	private String Address;
	


}
