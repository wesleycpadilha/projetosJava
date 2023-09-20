package com.crudapi.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudapi.restapi.database.BotBox;
import com.crudapi.restapi.entities.Bots;

//Vincula que a classe é do tipo REST.
@RestController
//Vincula a classe a uma URL.
@RequestMapping("/bots")
public class BotsREST {
    //Spring cria o obejto, injeta no atributo e gerencia.
    @Autowired
    //Atributo com operações basicas para manipular os objetos bots detro do banco de dados.
    private BotBox box;

    //Anotação para associar ao protocolo "GET".
    @GetMapping
    //Traz a lista de todos os objetos do repositorio.
    public List<Bots> get(){
        return box.findAll();
    }

    //Anotação para associar ao protocolo "POST".
    @PostMapping
    //Adiciona um objeto no repositorio.
    //"@RequestBody" o Spring converte os dados que vem em JSON para o objeto Java.
    public void post(@RequestBody Bots bots){
        box.save(bots);
    }

    //Anotação para associar ao protocolo "PUT".
    @PutMapping
    //Altera objetos no repositorio.
    public void put(@RequestBody Bots bots){
        //Só faz alterações caso o ID exista, caso contrario adiciona um novo objeto no repositorio.
        if(bots.getId()>0)
        box.save(bots);
    }

    //Anotação para associar ao protocolo "DELETE".
    @DeleteMapping
    //Exclui objeto do repositorio.
    public void delete(@RequestBody Bots bots){
        box.delete(bots);
    }
}