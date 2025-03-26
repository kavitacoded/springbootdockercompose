package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Food {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private String foodName;
	private String restAddress;
	
}
