package com.manager.manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.manager.manager.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>{
    
}
