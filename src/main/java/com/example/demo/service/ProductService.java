package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Producto;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductoRepository repository;

    public void addProduct(Producto product){
        repository.addProduct(product);
    }

    public List<Producto> getProduct(){
        return repository.getProduct();
    }
}
