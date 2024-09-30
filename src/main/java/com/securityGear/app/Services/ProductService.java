package com.securityGear.app.Services;


import com.securityGear.app.Entities.Product;
import com.securityGear.app.Repositories.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    //    @Autowired
    ProductRepo repo;

    //  constructor injection
    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }


//  -------------------------
//  the start of queries
//  -------------------------




    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }


//  -------------------------
//  void services
//  -------------------------


    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }




}