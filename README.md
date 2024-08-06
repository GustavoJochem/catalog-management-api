# Gerenciamento de Catálogo de Produtos

## Introdução
Este projeto foi desenvolvido para fins de estudo. Abaixo, você encontrará os detalhes do projeto e instruções sobre como executar a aplicação.

## O Desafio

A tarefa foi desenvolver uma API usando Java com Spring Boot para um sistema de gerenciamento de catálogo de produtos em uma aplicação de marketplace. As seguintes user stories foram convertidas em rotas para a aplicação:

### User Stories:

1. **Registro de Produto**: Como usuário, quero registrar um produto com seu proprietário, para que eu possa acessar seus dados no futuro (título, descrição, preço, categoria, ID do proprietário).

2. **Registro de Categoria**: Como usuário, quero registrar uma categoria com seu proprietário, para que eu possa acessar seus dados no futuro (título, descrição, ID do proprietário).

3. **Associação Produto-Categoria**: Como usuário, quero associar um produto a uma categoria.

4. **Atualização de Dados**: Como usuário, quero atualizar os dados de um produto ou categoria.

5. **Exclusão**: Como usuário, quero excluir um produto ou categoria do meu catálogo.

### Restrições:
- Um produto só pode ser associado a uma categoria por vez.
- Produtos e categorias pertencem a apenas um proprietário.

### Requisitos Adicionais:
- Este é um catálogo de produtos online, o que significa que haverá múltiplas requisições para edição de itens/categorias por segundo, bem como acesso ao endpoint de busca do catálogo.
- Considere o catálogo de produtos como uma compilação JSON de todas as categorias e itens disponíveis pertencentes a um usuário. Desta forma, o endpoint de busca do catálogo não precisa buscar informações no banco de dados.
- Sempre que houver uma alteração no catálogo de produtos, publique essa alteração no tópico "catalog-emit" no serviço AWS SQS.
- Implemente um consumidor que escute as alterações do catálogo para um proprietário específico.
- Quando o consumidor receber uma mensagem, busque no banco de dados o catálogo desse proprietário, gere o JSON do catálogo e publique-o em um bucket do serviço AWS S3.

### Tecnologias Utilizadas:
- **Banco de Dados**: PostgreSQL
- **Notificações**: AWS SQS (LocalStack)
- **Armazenamento**: AWS S3 (LocalStack)
- **Backend**: Java com Spring Boot

### Diagrama da Estrutura do Projeto:
![Diagrama](src/main/resources/static/diagram.png)

## Executando a Aplicação

### Pré-requisitos
- Java 21 ou superior
- Maven
- Docker

### Passos para Executar
1. **Clonar o Repositório**:
    ```bash
    git clone <repository-url>
    cd <repository-directory>
    ```

2. **Checkout para sua Branch**:
    ```bash
    git checkout <your-branch-name>
    ```

3. **Compilar a Aplicação**:
    ```bash
    mvn clean install
    ```
   
4. **Iniciar os serviços Docker para o banco de dados e o LocalStack**:
    ```bash
    docker-compose up -d
    ```

5. **Executar a Aplicação**:
    ```bash
    mvn spring-boot:run
    ```

6. **Documentação da API**:
   A documentação da API estará disponível em `http://localhost:8080/swagger-ui.html`