package br.com.cod3r.exerciciossb.DAO;


import br.com.cod3r.exerciciossb.Model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLOutput;

public class AlunoDAO {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void addAluno(String nome, String matricula, String curso, int idade){
        Aluno a = new Aluno(nome, matricula, curso, idade);
        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void removeAluno(int id){
        entityManager.getTransaction().begin();
        Aluno a = entityManager.find(Aluno.class, id);
        entityManager.remove(a);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void buscaAlunoID(int id){
        Aluno a = entityManager.find(Aluno.class, id);
        System.out.println(a);
    }

    public void alteraNomeAluno(int id, String nome){
        entityManager.getTransaction().begin();
        Aluno a  = entityManager.find(Aluno.class, id);
        a.setNome(nome);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}

