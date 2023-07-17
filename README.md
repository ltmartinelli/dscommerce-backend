# DSCOMMERCE
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/ltmartinelli/dscommerce-backend/blob/main/LICENSE)
## Sobre o Projeto
DSCommerce é uma aplicação full stack web construída como parte do curso **Formação Desenvolvedor Moderno**, oferecido pela [DevSuperior](https://devsuperior.com.br "Site da DevSuperior").

A aplicação consiste em um protótipo de sistema de comércio digital, incluindo um modelo de domínio abrangendo diferentes tipos de relacionamentos entre entidades, operações de CRUD e controle de acesso, simulando fluxos de caso de uso de um e-commerce. Algumas das operações que podem ser realizadas no sistema incluem:
- Consultar catálogo de produtos e pesquisar produtos por nome
- Inserir, atualizar ou deletar produtos no banco de dados
- Login de usuário 
- Gerenciamento de carrinho
- Registro de Pedidos

## Exemplos de Layout
![Layout 1](https://ltmartinelli-dev.netlify.app/img/thumbs/dscommerce.png) ![Layout 2](https://raw.githubusercontent.com/ltmartinelli/dsc-images/main/img.png)

## Modelo Conceitual
![Modelo Conceitual](https://github.com/ltmartinelli/dsc-images/blob/main/img2.png?raw=true)

# Tecnologias Utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- PostgreSQL
- JWT
- OAuth2
## Front end
- HTML / CSS / JS / TypeScript
- React
- React Router
- Axios
## Implantação em produção
- Back end: Railway
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório do back end
git clone https://github.com/ltmartinelli/dscommerce-backend

# entrar na pasta do projeto
cd dscommerce-backend

# executar o projeto (de forma alternativa, pode ser executado através de uma IDE como IntelliJ ou STS)
mvn spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/ltmartinelli/dscommerce-frontend

# entrar na pasta do projeto front end web
cd dscommerce-frontend

# instalar dependências
yarn

# executar o projeto
yarn dev
```

# Autor

Lucas Trindade Martinelli

https://www.linkedin.com/in/ltmartinelli
