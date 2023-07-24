package br.com.marcosalmeida.meuPrimeiroProjeto;
// Declare uma variável chamada "preco" e atribua o valor 29.99 a ela.  Em seguida, declare uma variável
// chamada "quantidade" e atribua o valor 3 a ela. Calcule o total multiplicando o preço pela quantidade
// e exiba o resultado no navegador.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exercicio06 {
    @GetMapping("/preco")
    public int retornoPreco(){
        double retornoPreco = 29.99;
        int quantidade = 3;
        double preco = retornoPreco * quantidade;
        return (int)preco;
    }
}
