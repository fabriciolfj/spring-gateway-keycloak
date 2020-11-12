# Spring gateway com keycloak
Essa poc tem como objeto demonstrar o uso do spring gateway integrado com o keycloak, onde facilita e muito o processo de implantação do oauth2 na arquitetura de microserviços.

### Detalhes
- O microservice Customer é o nosso resourceserver e ele valida o token recebido a cada requisição, no keycloack
- Gateway responsável por chamar os clients cadastrados no keycloak e chamar o mesmo para capturar o token.

### Passo a passo
- Primeiro temos que configurar o keycloak
- Acessar o endpoint login pelo gateway: http://porta gateway: host gateway/login
- Logar com as suas credenciais cadastradas no keycloack
- Pegar o session id e efetuar chamar o get criado no gateway: curl http://localhost:8080/token -H "Cookie: SESSION=9bf852f1-6e00-42f8-a9a2-3cbdced33993"
- Pegar o token e chamar o serviço customer pelo gateway, passando no header Authorization: "Bearer token" localhost:8060/customers

