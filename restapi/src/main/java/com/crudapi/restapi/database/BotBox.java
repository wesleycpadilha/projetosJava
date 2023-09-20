//Repositorio.
package com.crudapi.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapi.restapi.entities.Bots;

//Utiliza-se a biblioteca generica do SpringBoot que faz um CRUD basico, devemos apenas apontar para o Spring qual tabela "<IdentificadorDaTabela,tipoDoIdentificador>"
public interface BotBox extends JpaRepository<Bots,Long>{  
}
