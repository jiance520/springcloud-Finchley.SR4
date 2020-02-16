package net.xdclass.productservice.service;

import net.xdclass.productservice.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProduct();

    Product findById(int id);


}
