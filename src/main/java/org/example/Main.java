package org.example;

import org.example.dominio.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setNome("Java");
        cursoJava.setDescricao("Curso de Java");
        cursoJava.setCargaHoraria(40);

        Curso cursoPython = new Curso();
        cursoPython.setNome("Python");
        cursoPython.setDescricao("Curso de Python");
        cursoPython.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setNome("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setDataInicio(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDataInicio(LocalDate.now());
        bootcamp.setDataFinal(bootcamp.getDataInicio().plusDays(45));
        List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJava, cursoPython, mentoria);
        bootcamp.setConteudos(conteudosBootcamp);

        Dev felipe = new Dev();
        felipe.setNome("felipe");

        felipe.inscrever(cursoJava);
        felipe.inscrever(mentoria);
        felipe.inscrever(cursoPython);
        felipe.progredir();
        felipe.progredir();
        felipe.progredir();


        Dev joao = new Dev();
        joao.setNome("joao");


        joao.inscrever(cursoJava);
        joao.inscrever(cursoPython);

        joao.progredir();

        System.out.println("XP do Felipe: " + felipe.calcularTotalXP());
        System.out.println("_______________******________________________");
        System.out.println("XP do João: " + joao.calcularTotalXP());

        List<Dev> devs = Arrays.asList(felipe, joao)
                .stream()
                .sorted((dev1, dev2 )->
                Double.compare(dev2.calcularTotalXP(), dev1.calcularTotalXP()))
                .collect(Collectors.toList());

        for (Dev dev : devs) {
            System.out.println("________________________________________");

            System.out.println(dev.getNome() + " - XP: " + dev.calcularTotalXP());

            System.out.println("________________________________________");
        }





    }
}