package com.manager.manager.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.manager.Model.Product;
import com.manager.manager.Repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProduct(String id) throws Exception{
        Optional<Product> product = productRepository.findById(id);
        if(!product.isPresent()){
            throw new Exception();
        }
        return (Product) product.get();
    }

    public void createProduct(Product product){
        productRepository.save(product);
    }

    public void updateProduct(Product newProduct) throws Exception{
        Product currenProduct = getProduct(newProduct.getId());
        currenProduct.setId(newProduct.getId());
        currenProduct.setBrand(newProduct.getBrand());
        currenProduct.setProduct_line(newProduct.getProduct_line());
        currenProduct.setProduct_name(newProduct.getProduct_name());
        currenProduct.setProduct_size(newProduct.getProduct_size());
        currenProduct.setTax(newProduct.getTax());
        currenProduct.setRevenue(newProduct.getRevenue());
        currenProduct.setStock(newProduct.getStock());   
    }
}
