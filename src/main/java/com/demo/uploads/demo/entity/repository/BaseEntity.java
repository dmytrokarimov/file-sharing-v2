package com.demo.uploads.demo.entity.repository;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BaseEntity {

	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@Id
	@EqualsAndHashCode.Include
	@Column(name = "id")
	private String id;

}
