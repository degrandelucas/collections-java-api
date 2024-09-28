package Map.src.Pesquisa;

import java.util.HashMap; // Importa a classe HashMap para uso.
import java.util.Map; // Importa a interface Map.

public class ContagemPalavras {
    //atributos
    private Map<String, Integer> contagemPalavras;
 
    //construtor
    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavras.put(palavra, contagemPalavras.getOrDefault(palavra, 0) + contagem);
    }

    public void removerPalavra(String palavra){
        if (contagemPalavras.containsKey(palavra)) {
            Integer contagem = contagemPalavras.get(palavra);
            contagemPalavras.remove(palavra);
            
            System.out.println(palavra + " foi removida da contagem " + contagem);
        }
    }

    public void exibirContagemPalavras(){
        for(Map.Entry<String, Integer> entry : contagemPalavras.entrySet()){
            String palavra = entry.getKey();
            Integer contagem = entry.getValue();

            System.out.println("Palavra: " + palavra + ", contagem: " + contagem);
        }
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
    
        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {

            String palavra = entry.getKey();
            Integer contagem = entry.getValue(); 

            if (contagem > maiorContagem) {
                maiorContagem = contagem;
                palavraMaisFrequente = palavra;
            }
        }
    
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        //instancia
        ContagemPalavras palavras = new ContagemPalavras();

        palavras.adicionarPalavra("cachorro",1);
        palavras.adicionarPalavra("cachorro",1);
        palavras.adicionarPalavra("gato",1);
        palavras.adicionarPalavra("canario",1);
        palavras.adicionarPalavra("cachorro",1);

        palavras.exibirContagemPalavras();
        palavras.removerPalavra("gato");
        palavras.exibirContagemPalavras();

        System.out.println("Palavra mais frequente: "+palavras.encontrarPalavraMaisFrequente());

    }

}
