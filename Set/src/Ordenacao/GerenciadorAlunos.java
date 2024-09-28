package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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

    public void exibirAlunosPorNota(){
        
    }

    public void exibirAlunos(){
        System.out.println(salaAlunos);
    }

    }
