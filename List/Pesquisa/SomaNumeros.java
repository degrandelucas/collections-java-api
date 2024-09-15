package List.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
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
        if (!numeros.isEmpty()) {
            for (Numeros numerosPercorreNumeros : numeros) {
                soma = soma + numerosPercorreNumeros.getNumeroInteiro();
            }
        }
        else {
            System.out.println("lista de números está vazia");
            
        }
        return soma;
    }
    
    // public int encontrarMaiorNumero(){
        
    // }

    public void ordemCrescente(){
        if (!numeros.isEmpty()) {
            Collections.sort(numeros);
            System.out.println(numeros);
        }
        else {
            System.out.println("lista de números está vazia");
            
        }
    }

    public Numeros encontrarMenorNumero(){
        ordemCrescente();
        return numeros.get(0);
    }

    public List<Numeros> exibirNumeros(){
        return numeros;
    }
}
