package List.src.OperacoesBasicas;
public class ProcessoCompra {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Item 1", 10, 2);
        carrinho.adicionarItem("Item 2", 5, 2);
        carrinho.adicionarItem("Item 3", 20, 1);
        carrinho.adicionarItem("Item 4", 30, 1);

        System.out.println(carrinho.exibirItens());
        System.out.println("o valor atual do carrinho é " + carrinho.calcularValorTotal());
        carrinho.removerItemPorNome("Item 1");
        System.out.println(carrinho.exibirItens());
        System.out.println("o valor atual do carrinho é " + carrinho.calcularValorTotal());
    }
}
