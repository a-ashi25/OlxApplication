package com.zensar.olxadvertise.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("this is olx advertise model")
@Entity
public class Advertise {
	
	@ApiModelProperty("advertise id is of int type")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int advertiseId;
	private String advertiseTitle;
	private String advertisePrice;
	private String advertiseCategory;
	private String advertiseDescription;
	private String userName;
	private String createdDate;
	private String modifiedDate;
	private String status;
}
