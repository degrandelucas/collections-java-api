package Map.src.Ordenacao;

import java.util.HashMap; // Importa a classe HashMap para uso.
import java.util.Map; // Importa a interface Map.

public class LivrariaOnline {
    //atributos
    private Map<String,Livro> livrariaOnline;

    //construtor
    public LivrariaOnline() {
        this.livrariaOnline = new HashMap<>();
    } 

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        Livro livro = new Livro(titulo, autor, preco);
        livrariaOnline.put(link, livro);
    }

    public void removerLivro(String titulo){
        if (!livrariaOnline.isEmpty()) {
            Livro livroRemover = null;
            for (Map.Entry<String,Livro> entry : livrariaOnline.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    livroRemover = entry.getValue();
                    break;
                }
            }

            if (livroRemover != null) {
                livrariaOnline.values().remove(livroRemover);
                System.out.println("O livro '" + titulo + "' foi removido da livraria.");
            }else{
                System.out.println("Livro não encontrado");
            }
        } else{
            System.out.println("Livraria está vazia");
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Livro> livrosOrdenadosPorPreco = new ArrayList<>(livrariaOnline.values());

        Collections.sort(livrosOrdenadosPorPreco);

        for (Livro livro : livrosOrdenadosPorPreco) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Preço: " + livro.getPreco());
        }
    }

}

// Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:



// pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
// obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
// exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.
