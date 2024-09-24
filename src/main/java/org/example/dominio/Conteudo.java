package org.example.dominio;

import lombok.Data;

@Data
public abstract class Conteudo {

    private String nome;
    private String descricao;
    protected static final double XP_PADRAO = 10;

    public abstract double calcularXp();

    public abstract String imprimir();

}
