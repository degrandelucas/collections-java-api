package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
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

    public void exibir(){
        System.out.println(salaAula);
    }

    public void organizarPorMatricula(){
        Collections.sort(salaAula);
        System.out.println(salaAula);
    }

    public void organizarPorNome(){
        Collections.sort(salaAula, new ComparatorPorNome());
        System.out.println(salaAula);
    }

    //Metodo main
    public static void main(String[] args) {
        //Instanciando novo objeto
        OrdenacaoEPesquisa pesquisaSalaAula = new OrdenacaoEPesquisa();
        
        //Utilizando os métodos da classe OrdenacaoEPesquisa
        pesquisaSalaAula.preencherSalaAlunos("Lucas Degrande",8);
        pesquisaSalaAula.preencherSalaAlunos("Danyelle",7);
        pesquisaSalaAula.preencherSalaAlunos("Marcos",9);
        pesquisaSalaAula.preencherSalaAlunos("Luiza Eduarda",5);
        pesquisaSalaAula.preencherSalaAlunos("Lucas Franco",4);
        pesquisaSalaAula.preencherSalaAlunos("Ronny",10);
        pesquisaSalaAula.preencherSalaAlunos("Rafaela",3);

        pesquisaSalaAula.exibir();
        pesquisaSalaAula.organizarPorMatricula();
        pesquisaSalaAula.organizarPorNome();

    }
}

