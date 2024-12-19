# API para Gestão de Treinos de Musculação.
Este projeto consiste em uma API construída com Spring Boot para gerenciar treinos de musculação. A API permite criar, listar e deletar treinos de forma simples e eficiente.

## Requisitos.
- Java 17 ou superior.
- Spring Boot 3.
- Maven.

## Funcionalidades.
1. Criar Treino.
   - Endpoint: /api/treinos.
   - Método: POST.
   - Corpo JSON: { "nomeExercicio": "Supino Reto", "repeticoes": 10, "series": 3, "carga": 50 }.
     
2. Listar Treinos.
   - Endpoint: /api/treinos.
   - Método: GET.
   - Retorna todos os treinos cadastrados.

3. Deletar Treino.
   - Endpoint: /api/treinos/{id}
   - Método: DELETE
   - Exclui o treino com o ID especificado.

## Configuração do Banco de Dados.
 A aplicação utiliza o banco H2 (em memória) para armazenamento dos treinos. O console H2 pode ser acessado através do seguinte link:
   - URL: http://localhost:8080/h2-console
   - Credenciais:
        - Username: sa.
        - Password: (deixe em branco).

## Testar a API.
Use ferramentas como Postman ou execute os seguintes comandos:
curl -X POST http://localhost:8080/api/treinos -H "Content-Type: application/json" -d '{ "nomeExercicio": "Supino Reto", "repeticoes": 10, "series": 3, "carga": 50 }'

## Tecnologias Usadas.
  - Spring Web.
  - Spring Data JPA.
  - H2 Database (para testes).
  - Lombok.
  - Spring Boot DevTools.
