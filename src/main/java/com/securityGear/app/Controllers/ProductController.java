package com.securityGear.app.Controllers;


import com.securityGear.app.Entities.Product;
import com.securityGear.app.Services.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

//    @Autowired
    ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }


//  why doesnt post work

    @PostMapping("/products")
    public List<Product> greet(){
        return service.getProducts();
    }



    @GetMapping("/products")
    public List<Product> getUsers(){
        return service.getProducts();
    }


    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");

    }


    @PostMapping("/")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }



}
