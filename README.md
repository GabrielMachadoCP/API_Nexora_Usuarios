# FIAP - Checkpoint 1 - API de Pedidos - 2025
## Gabriel Machado Carrara Pimentel - RM 99880
## Leticia Cristina Gandarez Resina - RM 98069
## Vitor Hugo Gonçalve Rorigues - RM 97758

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

### 1. Criar um usuario

**URL**: `/usuarios`  
**Método**: `POST`

Cria um novo pedido com os dados fornecidos.

**Requisição (exemplo):**

```json
{
  "nome": "Vitoria Teixeira",
  "email": "vivi@email.com",
  "cpf": "56486152800",
  "senha": "Poc2407@"
}
```

## Rodar aplicação
Depois de rodar a API, mande alguns usuarios para o banco como mostrado, e abra o projeto mobile. Lá estará funcionando depois de rodar a api.
