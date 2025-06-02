package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.Producto;

import jakarta.annotation.PostConstruct;

@Repository
public class ProductoRepository {

    private List<Producto> dataBase;

    @PostConstruct
    public void init(){
        dataBase = new ArrayList<Producto>();
    }

    public void addProduct(Producto product){
        dataBase.add(product);
    }

    public List<Producto> getProduct(){
        return dataBase;
    }

}
