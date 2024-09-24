package org.example.dominio;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Mentoria extends Conteudo {

    private LocalDateTime dataInicio;

    @Override
    public double calcularXp() {
        return XP_PADRAO;
    }

    @Override
    public String imprimir() {
        return "";
    }

}
