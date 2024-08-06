package com.gustavojochem.catalog_management.domain.category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String title;
	private String description;
	private String ownerId;

	public Category() {}

	public Category(String id, String title, String description, String ownerId) {

		this.id = id;
		this.title = title;
		this.description = description;
		this.ownerId = ownerId;
	}
}
