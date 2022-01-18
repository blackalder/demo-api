package com.first.models.repos;

import java.util.List;

import com.first.models.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRevo extends CrudRepository<Product, Long>{
    List<Product> findByNameContains(String name);
}
