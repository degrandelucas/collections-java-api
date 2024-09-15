import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    //construtor
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }
    
    //metodos
    public void adicionarItem(String nome, double preco, int quantidade){
        Item novoItem = new Item(nome, preco, quantidade);
        itens.add(novoItem);
    }

    public void removerItemPorNome(String nome){
        if (!itens.isEmpty()) {
                itens.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
            }
        else{
            System.out.println("Carrinho está vazio");
        }
    }

    public double calcularValorTotal(){
        double valorTotalCarrinho = 0;
        for (Item item : itens) {
            valorTotalCarrinho += item.getPreco()*item.getQuantidade();
        }
        return valorTotalCarrinho;
    }
    
    public List<Item> exibirItens(){
        return itens;
    }
}
