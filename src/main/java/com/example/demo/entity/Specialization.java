package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="specialization_tab")
public class Specialization {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="spec_id_col")
	private long id;
	
	@Column(name="spec_code_col",
			length=10,
			nullable=false ,
			unique=true)
	private String code;
	
	@Column(name="spec_name_col" ,
			length=10 ,
			nullable=false,
			unique=true)
	private String name;
	
	@Column(name="spec_note_col",
			length=10 ,
			nullable=false,
			unique=true)
	private String note;

}
