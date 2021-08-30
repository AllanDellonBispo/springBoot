package br.com.cod3r.exerciciossb.Controller;

import br.com.cod3r.exerciciossb.Model.Aluno;
import br.com.cod3r.exerciciossb.Model.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    //Forma mais extensa de fazer o post, passando todos os parâmetros
    /*@PostMapping("/add")
    public Aluno addAluno(@RequestParam String nome, @RequestParam String matricula,
                           @RequestParam String curso, @RequestParam int idade){
        Aluno a = new Aluno(nome, matricula, curso, idade);
        alunoRepository.save(a);
        return a;
    }*/

    @PostMapping("/add")
    public Aluno addAluno(Aluno a){
        alunoRepository.save(a);
        return a;
    }

    @DeleteMapping("/remover")
    public void removeAluno(@RequestParam int id){
        alunoRepository.deleteById(id);
    }

    //Buscar todos os lementos da tabela
    @GetMapping("/buscar")
    public Iterable<Aluno> buscar(){
        return alunoRepository.findAll();
    }

    //Busca os elementos pelo id, OBS: O path está sendo usado apenas para funcionar como uma extensão de mérodo anterior
    @GetMapping(path = "/{id}")
    public Optional<Aluno> buscarPorId(@PathVariable int id){
        return alunoRepository.findById(id);
    }

    //Busca Paginada
    @GetMapping(path = "/pagina/{numeroPagina}")
    public Iterable<Aluno> buscaPaginada(@PathVariable int numeroDePaginas){
        Pageable page = PageRequest.of(0,3);
        return alunoRepository.findAll(page);
    }

    //Busca Por nome
    @GetMapping(path = "/nome/{nome}")
    public Iterable<Aluno> buscaNome(@PathVariable String nome){
        return alunoRepository.findByNomeContainingIgnoreCase(nome);
    }

    @PutMapping("/atualizaTudo")
    public Aluno atualiza(Aluno a){
        alunoRepository.save(a);
        return a;
    }
}
