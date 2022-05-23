# Projeto de Minhas Figurinhas (OAuth2 Client)

Projeto backend de uma API REST que representa uma Album de Figurinhas com Gratuito (Freemium). Este projeto é utilizado no módulo de segurança com Spring Security e OAuth2, servindo como **Client** para consumir a API REST da [aplicação de Livraria](https://github.com/zup-academy/oauth2-resourceserver-minhas-figurinhas/tree/with-spring-security-and-tests).

## Tecnologias utilizadas:

Algumas das principais tecnologias utilizadas neste projeto:

1. Java 11;
2. Spring Boot 2.6.8;
3. Bean Validation;
4. OpenFeign;
5. Spring Security OAuth2 Client;

## Ambiente de desenvolvimento

Para configurar e rodar a aplicação em ambiente local basta seguir os passos:

1. Clonar o repositório ou fazer seu download:

```shell
git clone git@github.com:zup-academy/oauth2-client-minhas-figurinhas.git
```
2. Importar o projeto na IDE IntelliJ;
3. Configurar e rodar a [aplicação de Livraria](https://github.com/zup-academy/oauth2-resourceserver-minhas-figurinhas/tree/with-spring-security-and-tests) (siga o README);
4. Acessar o Keycloack do projeto de Livraria (Docker-Compose);
5. No Realm `minhas-figurinhas`, siga os passos:
   - Crie um novo Client com nome `albuns-freemium-client`;
   - Habilite o fluxo Client Credentials Flow;
   - Crie e associe os Scopes `albuns:read` e `albuns:write` ao client (como Optional Client Scopes);
6. Copie o Client Secret para propriedade `client-secret` do arquivo `application.yml`;
7. Por fim, iniciar a aplicação via IDE ou linha de comando:

```shell
./mvnw spring-boot:run
``` 

## Consumindo a API REST da aplicação

Aqui demonstramos através de alguns exemplos como você pode consumir a API REST exposta pela aplicação. Estamos utilizando o comando `cURL` como cliente HTTP mas você pode usar qualquer outro de sua preferência, como POSTman ou Insomnia. 

Dado que a aplicação esteja rodando, basta executar os comandos abaixo para exercitar os endpoints públicos da aplicação.

### Detalhando um livro existente

```shell
curl --request POST \
  --url http://localhost:8081/albuns-freemium/api/albuns \
  --header 'Content-Type: application/json' \
  --data '{
            "planoContratado": "FREEMIUM",
            "id": 20118,
            "titulo": "Cervejas Artesanais",
            "descricao": "Todas as cervejas artesanais que eu já bebi na vida",
            "dono": "mestre.cervejeiro",
            "figurinhas": [
                {
                    "id": 1,
                    "descricao": "Baden Baden Golden",
                    "enderecoDaImagem": "http://cervejas-artesanais.com/dbz/baden-baden.png"
                },
                {
                    "id": 2,
                    "descricao": "Colorado Vixnu",
                    "enderecoDaImagem": "http://site.da.colorado.com.br/dbz/colorado-vixnu.jpg"
                }
            ]
        }'
```

## Duvidas e suporte

Basta entrar em contato com a equipe da Zup Edu responsável pelo Bootcamp no horário comercial.