package Modulo3.Aula02.TM;

import java.util.ArrayList;

public class Disciplina {
    String nome;
    int cargaHoraria;
    ArrayList<Estudante> estudantes = new ArrayList<Estudante>();

    public Disciplina(String nome, int cargaHoraria, ArrayList<Estudante> estudantes) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.estudantes = estudantes;
    }
}
