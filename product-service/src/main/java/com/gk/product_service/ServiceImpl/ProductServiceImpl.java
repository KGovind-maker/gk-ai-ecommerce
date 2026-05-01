package com.gk.product_service.ServiceImpl;

import com.gk.product_service.Entity.Product;
import com.gk.product_service.Service.ProductService;
import com.gk.product_service.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repo;

    // Constructor Injection (BEST PRACTICE)
    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public Product createProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}