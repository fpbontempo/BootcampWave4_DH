package Modulo3.Aula02.TM;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    int serie = 0; //ex: 8 ano, codigo A
    int codigo = 0;
    ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();


    public Turma(int serie, int codigo, ArrayList<Disciplina> disciplinas) {
        this.serie = serie;
        this.codigo = codigo;
        this.disciplinas = disciplinas;
    }
}
