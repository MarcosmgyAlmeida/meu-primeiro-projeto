package br.com.marcosalmeida.meuPrimeiroProjeto;
//Exercício 4: Declare uma variável do tipo String chamada "nome"
//e atribua o valor com o seu nome. Em seguida, exiba o valor da
//variável no console.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exercico04 {
   @GetMapping ("/nome")
    public String retornoNome(){
        String nome = "Marcos Antonio de Almeida";
        return nome;

    }
}
