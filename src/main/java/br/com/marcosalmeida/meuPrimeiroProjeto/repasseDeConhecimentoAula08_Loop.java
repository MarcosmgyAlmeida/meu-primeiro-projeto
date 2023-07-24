package br.com.marcosalmeida.meuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class repasseDeConhecimentoAula08_Loop {

    @GetMapping("meuPrimeiroLoop")
    public void meuPrimeiroLoop() {
        for (int numero = 1; numero <= 100; numero++) {
            System.out.println(numero);
        }
    }

    @GetMapping("/ola")
    public void ola() {
        String[] alunos = {"Calaça", "Ana", "Luis", "Marcos", "Xuxa", "João", "Juliana", "Thais", "José", "Nino"};
        int tamanhoDoArray = alunos.length;
        for (int posicao = 0; posicao < tamanhoDoArray; posicao++) {
            System.out.println("Olá, " + alunos[posicao]);
        }
    }
}