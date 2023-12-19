# Microsserviços Java com Spring Boot e Spring Cloud

Esse repositório o projeto desenvolvido para
o [curso Microsserviços Java com Spring Boot e Spring Cloud](https://www.udemy.com/course/microsservicos-java-spring-cloud/) do prof. Nelio Alves, da plataforma Udemy. </br>

### Sobre o Projeto
O projeto desenvolvido representa um sistema de gerenciamento de pagamentos de recursos humanos. O sistema é composto por vários microsserviços que comunicam entre si de forma transparente, escalável e com balanceamento de carga.</br>

Os microsserviços são registrados em um "Discovery Server" (Eureka), de modo que a comunicação entre eles é feita pelo nome do microsserviço. Além disso, as requisições são feitas em um API Gateway (Zuul), responsável por rotear e autorizar as requisições.</br>

#### Tópicos do curso: </br>
- Feign para requisições de API entre microsserviços</br>
- Ribbon para balanceamento de carga</br>
- Servidor Eureka para registro dos microsserviços</br>
- API Gateway Zuul para roteamento e autorização</br>
- Hystrix para tolerância a falhas</br>
- OAuth e JWT para autenticação e autorização</br>
- Servidor de configuração centralizada com dados em repositório Git</br>
- Geração de containers Docker para os microsserviços e bases de dados</br>

###
