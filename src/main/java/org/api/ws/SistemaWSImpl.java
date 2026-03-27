package org.api.ws;

import org.api.model.Cliente;
import org.api.model.Produto;
import org.api.repository.SistemaRepository;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "org.api.ws.SistemaWS")
public class SistemaWSImpl implements SistemaWS {

    private SistemaRepository repository = SistemaRepository.getInstance();

    @Override
    public Cliente cadastrarCliente(Cliente cliente) {
        return repository.adicionarCliente(cliente);
    }

    @Override
    public List<Cliente> listarClientes() {
        return repository.listarClientes();
    }

    @Override
    public Produto cadastrarProduto(Produto produto) {
        return repository.adicionarProduto(produto);
    }

    @Override
    public List<Produto> listarProdutos() {
        return repository.listarProdutos();
    }
}
