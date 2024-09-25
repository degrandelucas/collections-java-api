package Pesquisa;

public class Tarefas {
    //atributos
    private boolean concluida;
    private String descricao;
    
    //construtor
    public Tarefas(boolean concluida, String descricao) {
        this.concluida = concluida;
        this.descricao = descricao;
    }

    //metodos
    public boolean isConcluida() {
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefas " + descricao + " concluida: " + concluida;
    }

    
    
}
