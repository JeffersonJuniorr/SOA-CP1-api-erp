# 📦 API SOAP - Sistema ERP & CRM

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![SOAP](https://img.shields.io/badge/SOAP-API-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-success?style=for-the-badge)

Este projeto é uma API SOAP desenvolvida em Java, criada como um trabalho acadêmico de Engenharia de Software. O sistema simula a integração de dois módulos corporativos essenciais: um **ERP** (para gestão de inventário e produtos) e um **CRM** (para gestão de clientes).

A API foi construída com foco em fornecer um contrato de serviço estrito (WSDL) para ser consumido por outros sistemas ou interfaces front-end.

---

## 🚀 Tecnologias Utilizadas

* **Linguagem:** Java
* **Especificação:** JAX-WS (Java API for XML Web Services)
* **Servidor:** Embutido (via classe `javax.xml.ws.Endpoint`)
* **Persistência:** Repositório em memória (Padrão Singleton com coleções List/ArrayList) - *Sem dependência de banco de dados externo para simplificar a execução e focar na integração.*

---

## ⚙️ Arquitetura e Módulos

O sistema é dividido em dois domínios principais:

1. **Módulo CRM (Clientes):**
   * `cadastrarCliente`: Recebe os dados de um cliente (Nome, E-mail, Telefone) e persiste na memória gerando um ID único.
   * `listarClientes`: Retorna a lista completa de clientes cadastrados.

2. **Módulo ERP (Produtos):**
   * `cadastrarProduto`: Registra um novo item no inventário (Nome, Preço, Quantidade) com geração automática de ID.
   * `listarProdutos`: Retorna todos os produtos disponíveis no estoque.

---

## 🛠️ Como Executar o Projeto

Como o projeto utiliza o publicador nativo do Java, não é necessário configurar servidores de aplicação complexos (como Tomcat ou GlassFish).

Jefferson Junior Alvarez Urbina - RM 558497
Gabriel Barros Mazzariol - RM 555410
