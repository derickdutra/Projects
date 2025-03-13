package com.market.superMarket.models;


import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "produtos")
public class Product {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String nome;
    private int quantidade;
    private boolean preco;

    public boolean isPreco() {
        return preco;
    }

    public void setPreco(boolean preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
