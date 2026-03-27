package org.api.ws;

import org.api.model.Cliente;
import org.api.model.Produto;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface SistemaWS {

    @WebMethod
    Cliente cadastrarCliente(@WebParam(name = "cliente") Cliente cliente);

    @WebMethod
    List<Cliente> listarClientes();

    @WebMethod
    Produto cadastrarProduto(@WebParam(name = "produto") Produto produto);

    @WebMethod
    List<Produto> listarProdutos();
}
