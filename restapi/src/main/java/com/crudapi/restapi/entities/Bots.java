package com.crudapi.restapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Define que a classe a seguir será uma entidade, definindo que a classe será uma entidade.
//conforme as configurações o framework cria automaticamente uma coluna no banco de dados.
@Entity
//Classe e atributos.
public class Bots {
    //Indentificador da entidade "@id" atribuido ao mesmo pacote do framework.
    @Id
    //Gerador de id "IDENTITY" é definido o auto increment.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Regras de colunas "column" definido que os campos tem preenchimento obrigatorio.
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String ambiente;
    @Column(nullable = false)
    private String data;

    //Getters and setters, servem para protegeção dos dados atribuidos a classe. 
    //O método getter retorna o valor do atributo. O método setter recebe um parâmetro e o coloca no atributo.
    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the ambiente
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    /**
     * @return String return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

}