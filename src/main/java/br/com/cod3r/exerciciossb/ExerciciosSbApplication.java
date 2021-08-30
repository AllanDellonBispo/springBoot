package br.com.cod3r.exerciciossb;

import br.com.cod3r.exerciciossb.Model.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class ExerciciosSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosSbApplication.class, args);
	}

}
