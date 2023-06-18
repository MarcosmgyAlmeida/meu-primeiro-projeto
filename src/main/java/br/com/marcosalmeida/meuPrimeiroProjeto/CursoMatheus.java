package br.com.marcosalmeida.meuPrimeiroProjeto;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoMatheus {

    @GetMapping("/")
    public String escreverFrase(){
        return "Vamos estudar agora?";
    }

    @GetMapping("/somar/{numero1}/{n2}")
    public int somarDoisNumeros(@PathVariable("numero1") int n1, @PathVariable("n2") int n2){
        return  n1 + n2;
    }
}
