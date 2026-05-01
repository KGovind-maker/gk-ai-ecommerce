package com.gk.product_service.Service;

import com.gk.product_service.Entity.Product;
import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    List<Product> getAllProducts();
}
