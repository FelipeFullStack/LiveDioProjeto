package org.example.dominio;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class Bootcamp {

    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private List<Dev> devs = new ArrayList<>();
    private List<Conteudo> conteudos = new ArrayList<>();
}
