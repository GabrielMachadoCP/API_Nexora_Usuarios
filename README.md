# FIAP - Checkpoint 1 - API de Pedidos

Este projeto é uma API RESTful desenvolvida como parte do checkpoint 1 do curso de Engenharia de Software da FIAP. A API permite gerenciar pedidos, incluindo operações como criar, consultar, atualizar e excluir pedidos.

## Tecnologias

- Java 17
- Spring Boot
- Hibernate
- Maven
- H2 Database (em memória)
- Lombok

## Instalação

Para rodar o projeto localmente:

1. Clone o repositório para o seu ambiente local:

    ```bash
    git clone https://github.com/seu-usuario/fiap-checkpoint1.git
    cd fiap-checkpoint1
    ```

2. Instale as dependências utilizando Maven:

    ```bash
    mvn clean install
    ```

3. Execute a aplicação:

    ```bash
    mvn spring-boot:run
    ```

    A aplicação estará disponível em `http://localhost:8080`.

## Endpoints da API

### 1. Criar um Pedido

**URL**: `/pedidos`  
**Método**: `POST`

Cria um novo pedido com os dados fornecidos.

**Requisição (exemplo):**

```json
{
  "clienteNome": "João da Silva",
  "valorTotal": 120.50
}
