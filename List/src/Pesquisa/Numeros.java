package List.src.Pesquisa;

public class Numeros implements Comparable<Numeros> {
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

    @Override
    public int compareTo(Numeros crescenteNumeroInteiro) {
       return Integer.compare(this.numeroInteiro, crescenteNumeroInteiro.numeroInteiro);
    }
   
    
}
