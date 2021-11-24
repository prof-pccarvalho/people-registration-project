### Sistema de Gerenciamento de Pessoas em API REST com Spring

@@@ API REST com Spring Boot para cadastro e gerenciamento de pessoas de uma organização, até o Deploy na nuvem (Heroku).

* Utilizar o SDK Man caso queira instalar o Java e Maven no computador local ou virtual ou wsl.
* * curl -s "https://get.sdkman.io" | bash
* * source "/root/.sdkman/bin/sdkman-init.sh"
* * sdk version
* * sdk list java
* * sdk install java -choose version -
* * sdk use java -choose version -
* * sdk list maven
* * sdk install maven -choose version -
* * sdk use maven -choose version -

* Utilizamos o Java 17, Maven, Spring Boot, Heroku e GitHub.

* Projeto gerado no io.spring.start com as dependências:
* * spring-boot-starter-actuator
* * spring-boot-starter-data-jpa
* * spring-boot-starter-web
* * spring-boot-starter-test
* * spring-boot-devtools
* * h2database
* * lombok
* * mapstruct
* * xml-apis
* * hibernate-validator

* Criar o package controllers e a classe PersonController.java
* ** import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")

public class PersonController {

    @GetMapping
    public String getBook() {
        return "API Test" + " **** " + "First example - success";
    }
    
* executar o projeto
* *  abrir o navegador com a URL: 
*** http://localhost:8080/api/v1/people
* *  obter o retorno com a exibição da mensagem = API Test ****// First example - success

* Criar no heroku um novo app
* * linkar com o projeto do github
* * criar na raiz do projeto um arquivo system.properties indicando a versão Java utilizada
* * executar o deploy da branch para o heroku
* * abrir o navegador com a URL gerada : 
*** https://people-registration-project.herokuapp.com/api/v1/people
* * obter o retorno com a exibição da mensagem = 
    API Test ****// First example - success
    
    

