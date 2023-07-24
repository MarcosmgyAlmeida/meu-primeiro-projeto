package br.com.marcosalmeida.meuPrimeiroProjeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exercicio02 {
    @GetMapping("/peso")
    public String peso(){
        String meuPeso = "120 kg";
        return meuPeso;

    }
}
