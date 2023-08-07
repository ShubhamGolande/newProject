package com.main.webapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViewProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int vid;;
private String vname;
private String vpassword;
private long vmobileNumber;
@OneToOne(cascade = CascadeType.ALL)
private AddProduct addproduct;

}
