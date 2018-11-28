package me.afibarra.datajpa.repositories;

import me.afibarra.datajpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
