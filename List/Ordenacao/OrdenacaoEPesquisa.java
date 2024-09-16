package List.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoEPesquisa {
    //Atributos
    private List<Alunos> salaAula;

    //Construtor
    public OrdenacaoEPesquisa() {
        this.salaAula = new ArrayList<>();
    }

    //Metodos
    public void preencherSalaAlunos(String novoAluno, int novaMatricula){
        Alunos novoAlunoSala = new Alunos(novoAluno, novaMatricula);
        salaAula.add(novoAlunoSala);
    }

    //Metodo main
    public static void main(String[] args) {
        
    }
}

