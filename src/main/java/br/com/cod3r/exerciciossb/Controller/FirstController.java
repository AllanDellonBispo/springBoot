package br.com.cod3r.exerciciossb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/ola")
    public String ola(){
        return "Olá Mundo!";
    }
}
