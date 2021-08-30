package br.com.cod3r.exerciciossb.Controller;

import br.com.cod3r.exerciciossb.Model.Aluno;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class Calculadora {

    @GetMapping("/soma/{a}/{b}")
    public int soma(@PathVariable int a, @PathVariable int b){
        return a+b;
    }

    @GetMapping("/subtrair/{a}/{b}")
    public int subtrair(@PathVariable int a, @PathVariable int b){
        return a-b;
    }

    @GetMapping("/multiplicacao/{a}/{b}")
    public int multiplica(@PathVariable int a, @PathVariable int b){
        return a*b;
    }

    @GetMapping("divisao/{a}/{b}")
    public float divisao(@PathVariable int a, @PathVariable int b){
        return a/b;
    }
}
