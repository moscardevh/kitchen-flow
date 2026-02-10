package com.kitchenflow.restaurant_api.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String clienteNome;
    
    @Column(nullable = false)
    private String status = "PENDENTE";
    
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PedidoItem> itens = new ArrayList<>();
    
    @CreationTimestamp
    private LocalDateTime dataHora;
    
    private double total;
    
    // Construtores, getters e setters
    public Pedido() {}
    
    public Pedido(String clienteNome) {
        this.clienteNome = clienteNome;
    }
    
    // Getters e setters aqui...
}