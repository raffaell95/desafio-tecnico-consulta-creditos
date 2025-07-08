# Solução desenvolvida para a consulta de créditos constituídos.

## A API fornecerá informações essenciais como número do crédito constituído, número da NFS-e, data da constituição do crédito, valor do ISSQN, tipo do crédito e outros atributos.

### Tecnologias usadas:

- Spring Boot: 3.5.3
- Java: 21.0.7
- JDK: 21.0.7-temurin
- Docker: 28.3.1
- Postgres: 15
- Kafka: 7.5.0
- Angular: 16.2.0

### Build
- O projeto esta conteinerizado em docker
- Para rodar o projeto basta entrar no diretorio e rodar o comando `docker compose build --no-cache backend` em seguida `docker-compose up -d`, e pronto 
no momento que o projeto for inicializado o spring vai gerar automaticamente o banco de dados juntamente com as tabelas e inserir alguns dados de exemplo.

- Portas:
    - backend: `http://localhost:8080/swagger-ui/index.html`
    - frontend: `http://localhost:4200`
    - logs-kafka: `http://localhost:8081`

