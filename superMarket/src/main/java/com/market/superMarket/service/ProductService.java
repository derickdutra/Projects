package com.market.superMarket.service;

import com.market.superMarket.exception.Response;
import com.market.superMarket.models.Product;
import com.market.superMarket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll(){
        return productRepository.findAll();
    }

    public Product salvarProduto(Product product){
        return productRepository.save(product);
    }

    public void deletarProduto(Long id){
        productRepository.deleteById(id);
    }

    public Product atualizarProduto(Long id, Product produtoAtualizado) {
        Product produtoExistente = productRepository.findById(id)
                .orElseThrow(() -> new Response("Produto não encontrado"));

        produtoExistente.setNome(produtoAtualizado.getNome());
        produtoExistente.setQuantidade(produtoAtualizado.getQuantidade());
        produtoExistente.setPreco(produtoAtualizado.isPreco());

        return productRepository.save(produtoExistente);
    }



}
