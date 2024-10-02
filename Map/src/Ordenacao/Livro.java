package Map.src.Ordenacao;

public class Livro implements Comparable<Livro> {
    //atributos
    private String titulo;
    private String autor;
    private double preco;

    //construtor
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    //metodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
    }

    @Override
    public int compareTo(Livro outroLivro) {
        return Double.compare(this.preco, outroLivro.getPreco());
    }

    
    
}
