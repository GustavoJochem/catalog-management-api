package com.gustavojochem.catalog_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavojochem.catalog_management.domain.category.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

}
