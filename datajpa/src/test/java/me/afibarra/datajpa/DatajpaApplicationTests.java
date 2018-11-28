package me.afibarra.datajpa;

import me.afibarra.datajpa.entities.Student;
import me.afibarra.datajpa.repositories.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatajpaApplicationTests {

    @Autowired
    private StudentRepository repository;

    @Test
    public void testSaveStudent() {
        long id = 1L;

        Student student = new Student();
        student.setId(id);
        student.setName("Armando");
        student.setTestScore(10);

        repository.save(student);

        assertTrue(repository.findById(id).isPresent());
    }
}
