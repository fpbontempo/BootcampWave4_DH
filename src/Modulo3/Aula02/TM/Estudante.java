package Modulo3.Aula02.TM;

import java.time.LocalDate;

public class Estudante {
    String nome;
    LocalDate dataNascimento;
    int numeroMatricula;

    public Estudante(String nome, LocalDate dataNascimento, int numeroMatricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroMatricula = numeroMatricula;
    }
}
