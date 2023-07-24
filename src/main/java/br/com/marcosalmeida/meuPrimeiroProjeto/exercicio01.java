package br.com.marcosalmeida.meuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exercicio01 {
    @GetMapping ("/idade")
    public int retornoIdade(){

        int idade = 53;

        return idade ;
    }
}
