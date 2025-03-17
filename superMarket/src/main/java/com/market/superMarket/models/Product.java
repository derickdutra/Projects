<<<<<<< HEAD
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
    private double preco;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User use;

    public User getUse() {
        return use;
    }

    public void setUse(User use) {
        this.use = use;
    }
}
=======
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
    private double preco;

    public double isPreco() {
        return preco;
    }

    public void setPreco(double preco) {
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
>>>>>>> f44467b762a00adac988e8ec9325261accd60c48
