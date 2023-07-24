package br.com.marcosalmeida.meuPrimeiroProjeto;

//Exercício 3: Declare uma variável booleana chamada
//"carroTemPneu" e atribua o valor verdadeiro a ela.
//Em seguida, exiba o valor da variável no navegador.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exercicio03 {
    @GetMapping("/carro")
    public boolean carroTemPneu(){
        boolean carroTemPneu = true;
        return carroTemPneu;

    }
}
