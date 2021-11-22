package Personal_Form.projeto_cadastro_pessoas.repositories;

import Personal_Form.projeto_cadastro_pessoas.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}