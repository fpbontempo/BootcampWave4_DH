package Modulo3.Aula02.TM;

import groovy.util.logging.Log;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // você deverá criar uma classe principal para criar alguns estudantes e
        //disciplinas e, em seguida, criar algumas turmas e inserir os estudantes e disciplinas já
        //criados nessas turmas.
        Estudante Felipe = new Estudante("Felipe", LocalDate.parse("1865-08-03"), 46536);
        Estudante Clarissa = new Estudante("Clarissa", LocalDate.parse("1868-11-30"), 46537);
        Estudante Nene = new Estudante("Nene", LocalDate.parse("2012-07-15"), 46538);
        Estudante Kurt = new Estudante("Kurt", LocalDate.parse("2020-10-11"), 46539);
        Estudante Ozzy = new Estudante("Ozzy", LocalDate.parse("2020-03-06"), 46540);

        ArrayList<Estudante> AnoAtualProgramcao = new ArrayList<Estudante>();
        ArrayList<Estudante> AnoAtualLogica = new ArrayList<Estudante>();
        ArrayList<Estudante> AnoAtualWeb = new ArrayList<Estudante>();

        AnoAtualProgramcao.add(Felipe);
        AnoAtualProgramcao.add(Clarissa);
        AnoAtualProgramcao.add(Nene);
        AnoAtualProgramcao.add(Ozzy);
        AnoAtualProgramcao.add(Kurt);

        AnoAtualLogica.add(Felipe);
        AnoAtualLogica.add(Clarissa);
        AnoAtualLogica.add(Nene);

        AnoAtualWeb.add(Nene);
        AnoAtualWeb.add(Ozzy);
        AnoAtualWeb.add(Kurt);

        Disciplina Programacao = new Disciplina("Java", 80, AnoAtualProgramcao);
        Disciplina Logica = new Disciplina("Logica", 80, AnoAtualLogica);
        Disciplina Web = new Disciplina("Web", 80, AnoAtualWeb);

        ArrayList<Disciplina> AnoAtualDisciplina = new ArrayList<Disciplina>();

        AnoAtualDisciplina.add(Programacao);
        AnoAtualDisciplina.add(Logica);
        AnoAtualDisciplina.add(Web);

        Turma SistemaInformacao = new Turma(3,654,AnoAtualDisciplina);

        for (int i = 0; i<SistemaInformacao.disciplinas.size(); i++) {
            Disciplina element = SistemaInformacao.disciplinas.get(i);
            System.out.println("**************************");
            System.out.println(element.nome);
            for (Estudante e : element.estudantes) {
                System.out.printf("Nome %s - Data Nascimento %s - Número matricula %s%n", e.nome, e.dataNascimento, e.numeroMatricula);
            }
        }
        System.out.println("Fim");
    }
}
