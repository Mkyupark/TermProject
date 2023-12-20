package com.example.termproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "company")
public class CompanyEntity {
	@Id
	private String id;
	
	private String companyName;
	
	private String companyImg;
}

//INSERT INTO `Company` (`id`, `companyName`, `companyImg`) VALUES