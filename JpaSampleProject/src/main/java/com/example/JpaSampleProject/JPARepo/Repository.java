package com.example.JpaSampleProject.JPARepo;

import com.example.JpaSampleProject.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Product,Integer> {
}
