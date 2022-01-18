package com.first.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.first.models.entities.Product;
import com.first.models.repos.ProductRevo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
    
    @Autowired
    private ProductRevo productRevo;

    public Product create(Product produt){
        return productRevo.save(produt);
    }

    public Product findOne(Long id){
        Optional<Product> temp = productRevo.findById(id);
        if(!temp.isPresent()) return null;

        return temp.get();
    }

    public Iterable<Product> findAll(){
        return productRevo.findAll();
    }

    public void remove(Long id){
        productRevo.deleteById(id);
    }

    public List<Product> findByNameContains(String name){
        return productRevo.findByNameContains(name);
    }
}
