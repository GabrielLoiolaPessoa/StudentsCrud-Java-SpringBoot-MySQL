package br.com.gabriel.crudtest.Repository;

import br.com.gabriel.crudtest.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
