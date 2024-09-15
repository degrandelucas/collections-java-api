package List.Pesquisa;

public class Numeros {
    //atributos
    private int numeroInteiro;

    //construtor
    public Numeros(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    //metodos
    public int getNumeroInteiro() {
        return numeroInteiro;
    }

    @Override
    public String toString() {
        return "Numeros [numeroInteiro=" + numeroInteiro + "]";
    }
   
    
}
