package OperacoesBasicas;
public class ConjuntoPalavrasUnicas {
    //atributos
    private String palavra;

    //construtor
    public ConjuntoPalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    //metodos
    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [palavra=" + palavra + "]";
    }
   
    
}
