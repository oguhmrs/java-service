package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Producto;
import com.example.demo.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("ProductoController")
public class ProductoController {

    @Autowired
    private ProductService service;

    
    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Producto producto) {
        service.addProduct(producto);
    }
        
    @GetMapping("/getProduct")
    public List<Producto> getMethodName() {
        return service.getProduct();
    }
    

}
