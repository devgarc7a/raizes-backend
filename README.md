# Raízes do Nordeste - API Back-end

API REST desenvolvida em Java e Spring Boot para o trabalho da faculdado, chamado Raízes do Nordeste.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- PostgreSQL
- Maven
- JWT (JSON Web Token)
- Swagger OpenAPI
- Postman

## Requisitos

Antes de executar o projeto, é necessário ter:

- JDK 17 ou superior
- PostgreSQL
- Maven
- IntelliJ IDEA (é o que eu usei)

## Configuração do Banco de Dados

Criar um banco de dados PostgreSQL:

```sql
CREATE DATABASE raizes_db;
```

Configurar o arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/raizes_db
spring.datasource.username=postgres
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

## Executando o Projeto

1. Clonar o repositório:

```bash
git clone https://github.com/devgarc7a/raizes-backend.git
```

2. Entrar na pasta do projeto:

```bash
cd raizes-backend
```

3. Executar a aplicação:

```bash
mvn spring-boot:run
```

ou iniciar pela classe:

```text
RaizesBackendApplication.java
```

## Documentação da API

Após iniciar a aplicação:

Swagger:

http://localhost:8080/swagger-ui/index.html

## Login Padrão

Email:

```text
joao@raizes.com
```

Senha:

```text
raizes123
```

## Funcionalidades Implementadas

- Autenticação com JWT
- Cadastro de clientes
- Cadastro de produtos
- Cadastro de pedidos
- Cadastro de pagamentos
- Atualização automática do status do pedido após pagamento
- Controle de estoque
- Validação de estoque insuficiente
- Programa de fidelidade

## Autor

João Garcia de Almeida Filho

Curso: Análise e Desenvolvimento de Sistemas - UNINTER
