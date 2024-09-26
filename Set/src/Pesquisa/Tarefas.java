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

    
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefas " + descricao + " concluida: " + concluida;
    }

    
    
}
