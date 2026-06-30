# Raízes do Nordeste - Backend

API REST desenvolvida em Java e Spring Boot para o trabalho multidisciplinar da faculdade, chamado Raízes do Nordeste.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- PostgreSQL
- Maven
- JWT (JSON Web Token)
- Swagger OpenAPI
- Postman

## Requisitos

Antes de executar o projeto, é necessário ter instalado:

- JDK 17 ou superior
- PostgreSQL
- Maven
- IntelliJ IDEA (utilizado durante o desenvolvimento)

## Configuração do Banco de Dados

Criar o banco de dados PostgreSQL:

```sql
CREATE DATABASE raizes;
```

Configurar o arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/raizes
spring.datasource.username=postgres
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

## Executando o Projeto

Clone o repositório:

```bash
git clone https://github.com/devgarc7a/raizes-backend.git
```

Acesse a pasta do projeto:

```bash
cd raizes-backend
```

Execute a aplicação:

```bash
mvn spring-boot:run
```

Ou execute diretamente pela classe:

```text
RaizesBackendApplication.java
```

## Documentação da API

Após iniciar a aplicação, a documentação Swagger estará disponível em:

```text
http://localhost:8080/swagger-ui/index.html
```

## Login de Demonstração

Utilize as credenciais abaixo para autenticação:

**Email:**

```text
joao@raizes.com
```

**Senha:**

```text
raizes123
```

## Funcionalidades Implementadas

- Autenticação com JWT
- Cadastro de clientes
- Cadastro de produtos
- Cadastro de unidades
- Cadastro de pedidos
- Cadastro de pagamentos
- Atualização automática do status do pedido após pagamento aprovado
- Controle de estoque
- Validação de estoque insuficiente
- Programa de fidelidade
- Documentação da API com Swagger
- Testes da API utilizando Postman

## Estrutura do Projeto

O projeto foi desenvolvido utilizando arquitetura em camadas:

- Controller → Responsável pelos endpoints da API
- Service → Regras de negócio
- Repository → Acesso ao banco de dados
- Entity → Modelagem das entidades
- Config → Configurações de segurança e JWT

## Coleção Postman

A coleção de testes do Postman está disponível na pasta:

```text
/Postman/Trabalho Raízes - Testes.postman_collection.json
```

A coleção contém testes de:

- Autenticação
- Clientes
- Produtos
- Pedidos
- Pagamentos
- Estoque
- Cenários de erro

Permitindo reproduzir os principais fluxos da aplicação.

## Repositório

GitHub:

```text
https://github.com/devgarc7a/raizes-backend
```

## Autor

**João Garcia de Almeida Filho**

Curso: Análise e Desenvolvimento de Sistemas – UNINTER

Projeto desenvolvido para a disciplina Projeto Multidisciplinar – Trilha Back-End.
