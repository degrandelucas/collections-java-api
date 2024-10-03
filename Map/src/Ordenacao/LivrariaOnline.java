package Map.src.Ordenacao;

import java.util.HashMap; // Importa a classe HashMap para uso.
import java.util.Map; // Importa a interface Map.
import java.util.ArrayList;  // Importa a classe ArrayList para criar listas redimensionáveis.
import java.util.Collections;  // Importa a classe Collections para operações de ordenação e manipulação em coleções.
import java.util.List;  // Importa a interface List, que define comportamentos de listas de elementos.
//import java.util

public class LivrariaOnline {
    //atributos
    private Map<String,Livro> livrariaOnline;

    //construtor
    public LivrariaOnline() {
        this.livrariaOnline = new HashMap<>();
    } 

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        Livro novoLivro = new Livro(titulo, autor, preco);
        livrariaOnline.put(link, novoLivro);
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

    public void pesquisarLivrosPorAutor(String autor) {
        if (!livrariaOnline.isEmpty()) {
            boolean autorEncontrado = false;
            for (Livro livro : livrariaOnline.values()) {
                if (livro.getAutor().equalsIgnoreCase(autor)) { 
                    System.out.println("Título: " + livro.getTitulo() + ", Preço: " + livro.getPreco() + "do autor "+ autor);
                    autorEncontrado = true;
                }
            }
            if (!autorEncontrado) {
                System.out.println("Nenhum livro encontrado para o autor: " + autor);
            }
        } else {
            System.out.println("A livraria está vazia.");
        }
    }

    public void obterLivroMaisCaro() {
        if (!livrariaOnline.isEmpty()) {
            Livro livroMaisCaro = null;
            for (Livro livro : livrariaOnline.values()) {
                if (livroMaisCaro == null || livro.getPreco() > livroMaisCaro.getPreco()) {
                    livroMaisCaro = livro;
                }
            }
            if (livroMaisCaro != null) {
                System.out.println("Livro mais caro: " + livroMaisCaro.getTitulo() + ", Preço: " + livroMaisCaro.getPreco() + ", autor: "+ livroMaisCaro.getAutor());
            }
        } else {
            System.out.println("A livraria está vazia.");
        }
    }

    public void exibirLivroMaisBarato() {
        if (!livrariaOnline.isEmpty()) {
            Livro livroMaisBarato = null;
            for (Livro livro : livrariaOnline.values()) {
                if (livroMaisBarato == null || livro.getPreco() < livroMaisBarato.getPreco()) {
                    livroMaisBarato = livro;
                }
            }
            if (livroMaisBarato != null) {
                System.out.println("Livro mais barato: " + livroMaisBarato.getTitulo() + ", Preço: " + livroMaisBarato.getPreco() + ", autor: "+ livroMaisBarato.getAutor());
            }
        } else {
            System.out.println("A livraria está vazia.");
        }
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnlineAvenida = new LivrariaOnline();

        // Adiciona livros
        livrariaOnlineAvenida.adicionarLivro("link1", "O Senhor dos Anéis", "J.R.R. Tolkien", 59.90);
        livrariaOnlineAvenida.adicionarLivro("link2", "1984", "George Orwell", 39.90);
        livrariaOnlineAvenida.adicionarLivro("link3", "O Hobbit", "J.R.R. Tolkien", 29.90);
        livrariaOnlineAvenida.adicionarLivro("link4", "O Guia do Mochileiro das Galáxias", "Douglas Adams", 49.90);

        // Exibe livros ordenados por preço
        System.out.println("Livros ordenados por preço:");
        livrariaOnlineAvenida.exibirLivrosOrdenadosPorPreco();

        // Pesquisa livros por autor
        System.out.println("\nPesquisando livros por autor 'J.R.R. Tolkien':");
        livrariaOnlineAvenida.pesquisarLivrosPorAutor("J.R.R. Tolkien");

        // Obtém o livro mais caro
        System.out.println("\nObtendo o livro mais caro:");
        livrariaOnlineAvenida.obterLivroMaisCaro();

        // Exibe o livro mais barato
        System.out.println("\nExibindo o livro mais barato:");
        livrariaOnlineAvenida.exibirLivroMaisBarato();

        // Remove um livro pelo título
        System.out.println("\nRemovendo o livro '1984':");
        livrariaOnlineAvenida.removerLivro("1984");

        // Exibe livros após a remoção
        System.out.println("\nLivros após a remoção:");
        livrariaOnlineAvenida.exibirLivrosOrdenadosPorPreco();

    }

}
