package List.Pesquisa;

public class OperacoesComNumerosInteiros {
    public static void main(String[] args) {
        SomaNumeros listaNumero = new SomaNumeros();

        listaNumero.adicionarNumeros(2);
        listaNumero.adicionarNumeros(4);
        listaNumero.adicionarNumeros(6);
        listaNumero.adicionarNumeros(3);
        listaNumero.adicionarNumeros(1);

        System.out.println(listaNumero.exibirNumeros());
        System.out.println(listaNumero.calcularSoma());
        listaNumero.ordemDecrescente();
        System.out.println(listaNumero.encontrarMaiorNumero());
        listaNumero.ordemCrescente();
        System.out.println(listaNumero.encontrarMenorNumero());
    }
}
