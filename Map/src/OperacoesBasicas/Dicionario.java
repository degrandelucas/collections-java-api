package Map.src.OperacoesBasicas;

import java.util.HashMap; // Importa a classe HashMap para uso.
import java.util.Map; // Importa a interface Map.

public class Dicionario {
    //atributos
    private Map<String, String> dicionario;

    //construtor
    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    //metodo hashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dicionario == null) ? 0 : dicionario.hashCode());
        return result;
    }

    //metodo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dicionario other = (Dicionario) obj;
        if (dicionario == null) {
            if (other.dicionario != null)
                return false;
        } else if (!dicionario.equals(other.dicionario))
            return false;
        return true;
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (dicionario.containsKey(palavra)) {
            dicionario.remove(palavra);
            System.out.println(palavra + " foi removida do dicionario");
        }
        else{
            System.out.println("palavra não está no dicionario");
        }
    }

    public void exibirPalavras(){
        for (Map.Entry<String, String> variavelEntry : dicionario.entrySet()){
           String palavra = variavelEntry.getKey();
           String definicao = variavelEntry.getValue();

           System.out.println("Palavra: " + palavra + ", Significado: " + definicao);

        }
    }


    public void pesquisarPorPalavra(String palavra){
        if (dicionario.containsKey(palavra)) {
            String definicao = dicionario.get(palavra);
            System.out.println("O significado de " + palavra + " é " + definicao);            
        }
    }

    public static void main(String[] args) {
        //atributos
        Dicionario dicionarioLinguagens = new Dicionario();

        dicionarioLinguagens.adicionarPalavra("Java", "Uma linguagem de programação.");
        dicionarioLinguagens.adicionarPalavra("Python", "Uma linguagem de programação popular.");
        dicionarioLinguagens.adicionarPalavra("JavaScript", "Uma linguagem de programação muito usada no frontend.");

        dicionarioLinguagens.exibirPalavras();
        dicionarioLinguagens.removerPalavra("JavaScript");
        dicionarioLinguagens.exibirPalavras();
        dicionarioLinguagens.pesquisarPorPalavra("Java");

    }

}
