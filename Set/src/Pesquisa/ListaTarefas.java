package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributos
    private Set<Tarefas> listaTarefas;

    //construtor
    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    //metodos
    public void adicionarTarefa(boolean concluida, String descricao){
        Tarefas novaTarefa = new Tarefas(false, descricao);
        listaTarefas.add(novaTarefa);
    }

    public void removerTarefa(boolean concluida, String descricao){
        if (!listaTarefas.isEmpty()) {
            listaTarefas.removeIf(tarefas -> tarefas.isConcluida());        
        }
    }

    public void exibirTarefas(){
        System.out.println(listaTarefas);
    }

    public void contarTarefas(){
        int quantidadeTarefas = listaTarefas.size();
        System.out.println("quantidade de tarefas: " + quantidadeTarefas);
    }

    public Set<Tarefas> obterTarefasConcluidas(){
        
        Set<Tarefas> tarefasConcluidas = new HashSet<>();

        if (!listaTarefas.isEmpty()) {
            for (Tarefas tarefas : listaTarefas) {
                if (tarefas.isConcluida()){
                    tarefasConcluidas.add(tarefas);
                }
            }        
        }
        return tarefasConcluidas;
    }

    public Set<Tarefas> obterTarefasPendentes(){
        
        Set<Tarefas> tarefasPendentes = new HashSet<>();

        if (!listaTarefas.isEmpty()) {
            for (Tarefas tarefas : listaTarefas) {
                if (!tarefas.isConcluida()){
                    tarefasPendentes.add(tarefas);
                }
            }        
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!listaTarefas.isEmpty()) {
            for (Tarefas tarefas : listaTarefas) {
                if (!tarefas.isConcluida()){
                    tarefasPendentes.add(tarefas);
                }
            }        
        }
    }

    //     marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
// marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
// limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
        
         
}
