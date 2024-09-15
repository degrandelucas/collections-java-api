package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributos
    private List<Numeros> numeros;

    //construtor
    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    //metodos
    public void adicionarNumeros(int novoNumeroParaLista){
        Numeros novoNumero = new Numeros(novoNumeroParaLista);
        numeros.add(novoNumero);
    }


    public int calcularSoma(){
        int soma = 0;
        for (Numeros numerosPercorreNumeros : numeros) {
            soma = soma + numerosPercorreNumeros.getNumeroInteiro();
        }
        return soma;
    }
    
    public int encontrarMaiorNumero(){

    }

    public int encontrarMenorNumero(){
        
    }

    public List<Numeros> exibirNumeros(){
        return numeros;
    }
}
