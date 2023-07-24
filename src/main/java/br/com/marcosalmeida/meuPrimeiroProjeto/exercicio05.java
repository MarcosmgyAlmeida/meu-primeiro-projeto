package br.com.marcosalmeida.meuPrimeiroProjeto;
//Declare duas variáveis inteiras chamadas "numero1" e "numero2" e atribua a elas os valores 10 e 5, respectivamente.
// Em seguida, exiba a soma desses dois números no navegador.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exercicio05 {
    @GetMapping ("/soma")
        public int retornoSoma(){
            int numero1 = 10;
            int numero2 = 5;
            int soma=(numero1 + numero2);
            return soma;
    }
}

