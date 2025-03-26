# FIAP - Checkpoint 1 - API de Pedidos
## Gabriel Machado Carrara Pimentel - RM 99880

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

2. Instale as dependências utilizando Maven (VScode) ou abra o projeto usando Intellij (Como eu fiz):

    ```bash
    mvn clean install
    ```

3. Execute a aplicação (VScode):

    ```bash
    mvn spring-boot:run
    ```

    A aplicação estará disponível em `http://localhost:8080/pedidos`.
    Mostrando uma lista vazia.

## Configurações de banco de dados
```
spring.application.name=checkpoint1

# Configuração do banco de dados H2
spring.datasource.url=jdbc:h2:mem:pedidosdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

# Configuração para criar as tabelas automaticamente
spring.jpa.hibernate.ddl-auto=update

# Habilita o console do H2 para visualização dos dados
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.h2.console.settings.trace=false
spring.h2.console.settings.web-allow-others=false
```

## Endpoints da API

### 1. Criar um Pedido

**URL**: `/pedidos`  
**Método**: `POST`

Cria um novo pedido com os dados fornecidos.

**Requisição (exemplo):**

```json
{
  "clienteNome": "Gabriel Machado",
  "dataPedido": "2025-03-25",
  "valorTotal": 150.75
}
```
![Captura de tela 2025-03-25 222724](https://github.com/user-attachments/assets/f8697eb0-60ec-482e-9e47-991129a85bcb)

### 2. Buscar por Id
**URL**: `/pedidos/{id}`  
**Método**: `^GET`

Busca um pedido com o id fornecido.

![Captura de tela 2025-03-25 223054](https://github.com/user-attachments/assets/2e98c6b1-255f-48c8-9a08-85e9c582ed75)

### 3. Alterar Pedido
**URL**: `/pedidos/{id}`  
**Método**: `^PUT`

Altera um pedido com o id fornecido.

**Requisição (exemplo):**

```json
{
  "clienteNome": "Vitor Goncalves",
  "dataPedido": "2025-03-20",
  "valorTotal": 100.00
}
```

![Captura de tela 2025-03-25 223420](https://github.com/user-attachments/assets/2a5d38dc-cc99-44b1-8787-acaf32ceee19)

### 4. Excluir Pedido
**URL**: `/pedidos/{id}`  
**Método**: `^DELETE`

Exclui um pedido com o id fornecido.

![Captura de tela 2025-03-25 223606](https://github.com/user-attachments/assets/4651ca0a-e8e2-4501-bc77-282065a2a26a)

### 5. Listando Todos
**URL**: `/pedidos`  
**Método**: `^GET`

Lista todos os pedidos da tabela.

![Captura de tela 2025-03-25 223720](https://github.com/user-attachments/assets/c437031f-2f53-4ee4-9be1-71345be32f7c)

### 6. Buscar por Valor em ordem crescente
**URL**: `/pedidos/valor`  
**Método**: `^GET`

Lista todos os pedidos ordenando pelo valor em ordem crescente.

![Captura de tela 2025-03-25 223852](https://github.com/user-attachments/assets/af1f078b-fa1e-44f4-a70a-39e3b1c3923a)
