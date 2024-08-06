package com.gustavojochem.catalog_management.domain.product;

import com.gustavojochem.catalog_management.domain.category.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String title;
	private String description;
	private String ownerId;
	private Integer price;
	@ManyToOne
	private Category category;

	public Product() {}

	public Product(String id, String title, String description, String ownerId, Integer price, Category category) {

		this.id = id;
		this.title = title;
		this.description = description;
		this.ownerId = ownerId;
		this.price = price;
		this.category = category;
	}
}
