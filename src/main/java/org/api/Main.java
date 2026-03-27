package org.api;

import org.api.ws.SistemaWSImpl;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {

        String url = "http://localhost:8080/sistema";

        System.out.println("Publicando na URL: " + url);

        Endpoint.publish(url, new SistemaWSImpl());

        System.out.println("Serviço rodando! Para ver o contrato WSDL, acesse no navegador: " + url + "?wsdl");
    }
}
