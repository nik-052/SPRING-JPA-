package com.example.JpaSampleProject.ProductController;

import com.example.JpaSampleProject.Entity.Product;
import com.example.JpaSampleProject.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @PostMapping("/home/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.addValue(product);
    }
    @PostMapping("/home/addProducts")
    public List<Product> addProducts (@RequestBody List<Product> products)
    {
        return service.addValues(products);
    }
    @GetMapping("/home/showAll")
    public List<Product> showAll()
    {
        return service.show();
    }
    @GetMapping("/home/findByid/{id}")
    public Product findByid(@PathVariable int id){
        return service.findid(id);
    }
    @PutMapping("/home/update")
    public Product updateProduct(@RequestBody Product product){
        return service.update(product);
    }
    @DeleteMapping("/home/delete/{id}")
    public String deletebyID(@PathVariable int id)
    {
        return service.deleteId(id);
    }
}
