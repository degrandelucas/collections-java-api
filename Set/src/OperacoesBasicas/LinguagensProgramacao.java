package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class LinguagensProgramacao {

    //atributos
    private Set<ConjuntoPalavrasUnicas> linguagens;

    //construtor
    public LinguagensProgramacao() {
        this.linguagens = new HashSet<>();
    }

    //metodos
    public void adicionarPalavra(String palavra){
        ConjuntoPalavrasUnicas novaLinguagem = new ConjuntoPalavrasUnicas(palavra);
        linguagens.add(novaLinguagem);
    }

    public void removerPalavra(String palavra){
        if (!linguagens.isEmpty()) {
            linguagens.removeIf(linguagens -> linguagens.getPalavra().equalsIgnoreCase(palavra));
        }
        else{
            System.err.println("conjunto de linguagens está vazio");
        }
    }

    public void verificarPalavra(String palavraParaVerificar){
        if (!linguagens.isEmpty()) {
            for (ConjuntoPalavrasUnicas verificarPalavra : linguagens) {
                if (palavraParaVerificar.equalsIgnoreCase(verificarPalavra.getPalavra())) {
                    System.out.println("Palavra " + palavraParaVerificar + " pertence ao conjunto" + linguagens);                     
                }
                
            }
        }else{
            System.out.println("Palavra " + palavraParaVerificar + " não pertence ao conjunto");  
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(linguagens);
    }

    public static void main(String[] args){
        LinguagensProgramacao LinguagensDeProgramacao = new LinguagensProgramacao();

        LinguagensDeProgramacao.adicionarPalavra("Java");
        LinguagensDeProgramacao.adicionarPalavra("Python");
        LinguagensDeProgramacao.adicionarPalavra("JavaScript");
        LinguagensDeProgramacao.adicionarPalavra("Ruby");
        LinguagensDeProgramacao.adicionarPalavra("C#");
        LinguagensDeProgramacao.adicionarPalavra("Go");

        LinguagensDeProgramacao.exibirPalavrasUnicas();

        LinguagensDeProgramacao.removerPalavra("Ruby");

        LinguagensDeProgramacao.exibirPalavrasUnicas();

        LinguagensDeProgramacao.verificarPalavra("java");

    }
    
}
