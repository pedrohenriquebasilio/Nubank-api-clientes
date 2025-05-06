Nubank API Clientes

Projeto desenvolvido como parte de um desafio técnico para gerenciar clientes e seus contatos, implementado em Java com Spring Boot. A aplicação permite criar, atualizar, consultar e excluir clientes, bem como gerenciar múltiplos contatos associados a cada cliente, respeitando um relacionamento do tipo "muitos para um" (um cliente pode ter vários contatos).
Objetivo do Desafio
O desafio consistiu em criar uma API RESTful que:

Permita o gerenciamento de clientes (CRUD: criar, ler, atualizar, deletar).
Associe múltiplos contatos a um cliente, com operações de adicionar, atualizar e remover contatos.
Garanta a integridade do relacionamento entre clientes e contatos.
Utilize boas práticas de desenvolvimento, como validação de dados, tratamento de erros e documentação.

Funcionalidades

Gerenciamento de Clientes:
Criar um novo cliente com informações básicas (ex.: nome, CPF).
Consultar todos os clientes ou um cliente específico por ID.
Atualizar dados de um cliente.
Excluir um cliente (e seus contatos associados, se aplicável).


Gerenciamento de Contatos:
Adicionar um novo contato a um cliente (ex.: nome do contato, telefone, e-mail).
Listar todos os contatos de um cliente.
Atualizar informações de um contato existente.
Remover um contato de um cliente.


Validação de dados (ex.: CPF único, campos obrigatórios).
Relacionamento "many-to-one" entre contatos e clientes, implementado com JPA/Hibernate.

Tecnologias Utilizadas

Java 17: Linguagem principal.
Spring Boot 3.1.0: Framework para criação da API REST.
Spring Data JPA: Para persistência e gerenciamento do banco de dados.
H2 Database: Banco de dados em memória para testes (pode ser configurado para PostgreSQL ou outro).
Maven: Gerenciador de dependências.
Lombok: Para reduzir boilerplate no código.
SpringDoc OpenAPI: Para documentação da API com Swagger.

Pré-requisitos

Java 17 ou superior.
Maven (versão 3.8.0 ou superior).
(Opcional) Banco de dados relacional, como PostgreSQL, caso configurado.
(Opcional) Postman ou similar para testar a API.

Instalação e Configuração

Clonar o repositório:
git clone https://github.com/pedrohenriquebasilio/Nubank-api-clientes.git
cd Nubank-api-clientes


Compilar e instalar dependências:
mvn clean install


Configurar o banco de dados (opcional):

Por padrão, o projeto usa o banco H2 em memória.
Para usar outro banco (ex.: PostgreSQL), edite o arquivo src/main/resources/application.properties:spring.datasource.url=jdbc:postgresql://localhost:5432/nubank_clientes
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update




Executar a aplicação:
mvn spring-boot:run

A aplicação estará disponível em http://localhost:8080.

Acessar a documentação da API:

Abra o Swagger em: http://localhost:8080/swagger-ui.html.



Endpoints Principais
Clientes

POST /api/clientes: Criar um novo cliente.
Exemplo de payload:{
  "nome": "João Silva",
  "cpf": "12345678901"
}




GET /api/clientes: Listar todos os clientes.
GET /api/clientes/{id}: Consultar um cliente por ID.
PUT /api/clientes/{id}: Atualizar um cliente.
DELETE /api/clientes/{id}: Excluir um cliente.

Contatos

POST /api/clientes/{id}/contatos: Adicionar um contato a um cliente.
Exemplo de payload:{
  "nome": "Maria Souza",
  "telefone": "11987654321",
  "email": "maria@email.com"
}




GET /api/clientes/{id}/contatos: Listar contatos de um cliente.
PUT /api/contatos/{id}: Atualizar um contato.
DELETE /api/contatos/{id}: Excluir um contato.

Consulte a documentação no Swagger para detalhes completos.
Estrutura do Projeto
Nubank-api-clientes/
├── src/
│   ├── main/
│   │   ├── java/com/example/nubank/
│   │   │   ├── controller/    # Controladores REST
│   │   │   ├── entity/        # Entidades JPA (Cliente, Contato)
│   │   │   ├── repository/    # Repositórios Spring Data
│   │   │   ├── service/       # Lógica de negócio
│   │   │   └── NubankApplication.java  # Classe principal
│   │   └── resources/
│   │       └── application.properties  # Configurações
├── pom.xml                    # Dependências Maven
└── README.md                  # Este arquivo

Como Testar

Inicie a aplicação com mvn spring-boot:run.
Use o Postman ou cURL para testar os endpoints. Exemplo:curl -X POST http://localhost:8080/api/clientes \
-H "Content-Type: application/json" \
-d '{"nome":"João Silva","cpf":"12345678901"}'


Verifique os dados no banco H2 (acesso via http://localhost:8080/h2-console, se habilitado).

Contribuindo

Faça um fork do repositório.
Crie uma branch (git checkout -b feature/sua-funcionalidade).
Commit suas alterações (git commit -m "Adiciona funcionalidade X").
Envie a branch (git push origin feature/sua-funcionalidade).
Abra um Pull Request.

Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
Observações

Este projeto foi desenvolvido como parte de um desafio técnico e não está afiliado ao Nubank.
O banco H2 é usado por padrão para simplificar testes, mas o projeto suporta outros bancos relacionais.
Para ambientes de produção, recomenda-se configurar um banco persistente e implementar segurança adicional (ex.: autenticação JWT).

