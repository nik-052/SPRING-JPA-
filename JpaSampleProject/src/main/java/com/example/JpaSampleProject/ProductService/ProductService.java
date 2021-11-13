package com.example.JpaSampleProject.ProductService;

import com.example.JpaSampleProject.Entity.Product;
import com.example.JpaSampleProject.JPARepo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    Repository repo;

    public Product addValue(Product product){
        return repo.save(product);
    }

    public List<Product> addValues(List<Product> products) {
        return repo.saveAll(products);
    }

    public List<Product> show() {
        return repo.findAll();
    }

    public Product findid(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product update(Product product) {
        Product existingProduct = repo.findById(product.getId()).orElse(null);
        existingProduct.setId(product.getId());
        existingProduct.setName(product.getName());
        existingProduct.setAge(product.getAge());
        existingProduct.setGender(product.getGender());
        return repo.save(existingProduct);
    }

    public String deleteId(int id) {
        repo.deleteById(id);
        return "Product Deleted - "+id;
    }
}
