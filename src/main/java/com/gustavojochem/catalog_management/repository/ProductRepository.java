package com.gustavojochem.catalog_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavojochem.catalog_management.domain.product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
