package org.api.repository;

import org.api.model.Cliente;
import org.api.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class SistemaRepository {

    private static SistemaRepository instance;
    private List<Cliente> clientes;
    private List<Produto> produtos;
    private int clienteIdCounter = 1;
    private int produtoIdCounter = 1;

    private SistemaRepository() {
        clientes = new ArrayList<>();
        produtos = new ArrayList<>();

        // dados iniciais para facilitar os testes
//        produtos.add(new Produto(produtoIdCounter++, "Camiseta Algodão", 59.90, 100));
//        clientes.add(new Cliente(clienteIdCounter++, "João Silva", "joao@email.com", "11999999999"));
    }

    public static SistemaRepository getInstance() {
        if (instance == null) {
            instance = new SistemaRepository();
        }
        return instance;
    }

    public Cliente adicionarCliente(Cliente c) {
        c.setId(clienteIdCounter++);
        clientes.add(c);
        return c;
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Produto adicionarProduto(Produto p) {
        p.setId(produtoIdCounter++);
        produtos.add(p);
        return p;
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }
}