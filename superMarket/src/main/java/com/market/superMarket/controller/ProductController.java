package com.market.superMarket.controller;

import com.market.superMarket.models.Product;
import com.market.superMarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/produtos")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> productList(){
        return productService.listAll();
    }

    @PostMapping
    public Product addProdutos(@RequestBody Product product){
        return productService.salvarProduto(product);
    }

    @DeleteMapping("/{id}")
    public void removerProdutos(@PathVariable Long id){
        productService.deletarProduto(id);
    }

    @PutMapping("/{id}")
    public Product atualizarProduto(@PathVariable Long id, @RequestBody Product product){
        return productService.atualizarProduto(id, product);
    }
}
