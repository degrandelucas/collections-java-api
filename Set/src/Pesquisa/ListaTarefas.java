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
                if (tarefas.getDescricao().equalsIgnoreCase(descricao)){
                    tarefas.setConcluida(true);
                }
            }        
        }else{
            System.out.println("Lista de tarefas está vazia");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if (!listaTarefas.isEmpty()) {
            for (Tarefas tarefas : listaTarefas) {
                if (tarefas.getDescricao().equalsIgnoreCase(descricao)){
                    tarefas.setConcluida(false);
                }
            }        
        }else{
            System.out.println("Lista de tarefas está vazia");
        }
    }

    public void limparListaTarefas(){
        listaTarefas.clear();
    }
        
    public static void main(String[] args) {
        ListaTarefas novaListaTarefas = new ListaTarefas();

        novaListaTarefas.adicionarTarefa(false, "Tarefa 1");
        novaListaTarefas.adicionarTarefa(true, "Tarefa 1");
        novaListaTarefas.adicionarTarefa(false, "Tarefa 2");
        novaListaTarefas.adicionarTarefa(true, "Tarefa 3");
        novaListaTarefas.adicionarTarefa(false, "Tarefa 4");
        novaListaTarefas.adicionarTarefa(true, "Tarefa 5");
        novaListaTarefas.adicionarTarefa(false, "Tarefa 6");
        novaListaTarefas.adicionarTarefa(true, "Tarefa 7");

        novaListaTarefas.contarTarefas();

        novaListaTarefas.exibirTarefas();

        novaListaTarefas.obterTarefasConcluidas();
        novaListaTarefas.exibirTarefas();

        novaListaTarefas.obterTarefasPendentes();
        novaListaTarefas.exibirTarefas();

        novaListaTarefas.marcarTarefaConcluida("Tarefa 6");

        novaListaTarefas.marcarTarefaPendente("Tarefa 7");

        novaListaTarefas.exibirTarefas();
        
        novaListaTarefas.limparListaTarefas();
    }     
}
