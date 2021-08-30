package br.com.cod3r.exerciciossb.Model.repositories;

import br.com.cod3r.exerciciossb.Model.Aluno;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlunoRepository extends PagingAndSortingRepository<Aluno, Integer> {

    public Iterable <Aluno> findByNomeContainingIgnoreCase(String nome);
}
