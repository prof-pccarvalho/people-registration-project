# people-registration-project

### Sistema de Gerenciamento de Pessoas em API REST com Spring

Instrutor Rodrigo Peleias --> https://github.com/rpeleias-v1/personapi_digital_innovation_one

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

* Criar no projeto os package:
*	* enum com a classe PhoneType
*	* entities com a classe Person e Phone
*	* abrir o navegador com a URL gerada :
*** http://localhost:8080/h2-console 
*	* nas configurações do banco JDBC inserir a URL gerada :
*** jdbc:h2:mem:240cccdd-946d-4830-ace2-7d9e1f1d276a
*	* obtendo as duas tabelas Person e Phone

* Criar no projeto os package:
*	* repositories com a interface PersonRepository

* Criar o método Post na classe PersonController:

public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public String createPerson(@RequestBody Person person) {
        Person savedPerson = personRepository.save(person);
        return "API Rest";
	}

* Abrir a URL do Postman:
https://www.postman.com/
*	* escolher o metodo POST com a URL:
http://localhost:8080/api/v1/people

e incluir o json abaixo no Body em modo raw:

json:
{
    "firstName": "PC",
    "lastName" : "Carvalho",
    "cpf" : "369.333.878-79",
    "phones" : [
        {
            "type" : "MOBILE",
            "number" : "(11)999999999"
        }
    ]
}

Obtendo a resposta de API Rest criar os outros 2 métodos que incluem chamadas a outras classes.

// segunda metodo com o uso do BD H2
    //public String createPerson(@RequestBody  Person person) {
    //    Person savedPerson = personRepository.save(person);
    //    return "API Rest";
    }
	
	//terceiro exemplo com método retornando o Id da inclusão
    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        Person savedPerson = personRepository.save(person);
        return new MessageResponseDTO("Created person with ID " + savedPerson.getId());
	}
	

* Referências:

DTO: https://pt.stackoverflow.com/questions/31362/o-que-%C3%A9-um-dto 

H2: https://www.h2database.com/html/main.html 

Hibernate: https://www.caelum.com.br/apostila-java-web/uma-introducao-pratica-ao-jpa-com-hibernate 

Ivan Souza, O que é Rest : https://rockcontent.com/br/blog/rest/ 

IntelliJ: https://www.jetbrains.com/pt-br/idea/ 

Java SE: https://www.oracle.com/java/technologies/java-se-glance.html 

Loiane Groner, CRUD REST using Spring Boot 2, Hibernate, JPA, and MySQL em:

https://www.oracle.com/br/technical-resources/articles/dsl/crud-rest-sb2-hibernate.html 

Lombok: https://github.com/rzwitserloot/lombok/wiki 

MapStruct: https://mapstruct.org/ e https://medium.com/dev-cave/mapstruct-mapeando-seus-dtos-para-model-8bc362b628fe 

Maven: https://pt.stackoverflow.com/questions/59240/para-que-serve-o-maven 

Padrão DAO: 

https://pt.stackoverflow.com/questions/113840/como-funciona-o-padr%C3%A3o-dao 

Postman: https://learning.postman.com/docs/getting-started/introduction/ 

REST: https://restfulapi.net/ 

Rodrigo Peleias : Spring Boot - API REST para Cadastro de usuários. ,  https://github.com/rpeleias/personapi_dio_live_coding 

Roy Fielding: https://www.ics.uci.edu/~fielding/pubs/dissertation/top.htm 

Spring Boot: https://spring.io/projects/spring-boot 

Spring Data JPA : https://spring.io/projects/spring-data-jpa 
