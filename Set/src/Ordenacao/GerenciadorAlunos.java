package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;


public class GerenciadorAlunos {
    //atributos
    private Set<Alunos> salaAlunos;

    //construtor
    public GerenciadorAlunos() {
        this.salaAlunos = new HashSet<>();
    }

    //metodos
    public void adicionarAluno(String nome, int matricula, double media){
        Alunos novoAluno = new Alunos(nome, matricula, media);
        salaAlunos.add(novoAluno);
    }

    public void removerAluno(int matricula){
        if (!salaAlunos.isEmpty()) {
                salaAlunos.removeIf(salaAlunos -> salaAlunos.getMatricula()==(matricula));
            }
            
        }

    public void exibirAlunosPorNome(){
        Set<Alunos> salaAlunosPorNome = new TreeSet<>();
        salaAlunosPorNome.addAll(salaAlunos);
        System.out.println(salaAlunosPorNome);
    }

    public void exibirAlunosPorNotaMedia(){
        Set<Alunos> salaAlunosPorNotaMedia = new TreeSet<>(new Comparator<Alunos>() {
            
            //metodo compare do Comparator
            public int compare(Alunos aluno1, Alunos aluno2){
                return Double.compare(aluno1.getMedia(), aluno2.getMedia());
            }
        });

        salaAlunosPorNotaMedia.addAll(salaAlunos);
        System.out.println(salaAlunosPorNotaMedia);
    }

    public void exibirAlunos(){
        System.out.println(salaAlunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos colegial1A = new GerenciadorAlunos();

        colegial1A.adicionarAluno("Lucas", 1, 8.5);
        colegial1A.adicionarAluno("Danyelle", 2, 10);
        colegial1A.adicionarAluno("Marcos", 3, 9);
        colegial1A.adicionarAluno("Luiza", 4, 9);
        colegial1A.adicionarAluno("Ronny", 5, 9.5);
        colegial1A.adicionarAluno("Rafaela", 6, 8.75);


        colegial1A.exibirAlunos();
        colegial1A.exibirAlunosPorNome();
        colegial1A.exibirAlunosPorNotaMedia();
        colegial1A.removerAluno(3);
        colegial1A.exibirAlunos();
    }
    
}
