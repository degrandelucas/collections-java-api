package Ordenacao;

public class Alunos implements Comparable<Alunos> {
    //atributos
    private String nome;
    private int matricula;
    private double media;

    //construtor
    public Alunos(String nome, int matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    //metodos    
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNota(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno [" + nome + ", matricula=" + matricula + ", nota=" + media + "]";
    }

    @Override
    public int compareTo(Alunos alunoNome) {
        return this.nome.compareTo(alunoNome.getNome());
    }

    //metodo hashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    //metodo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alunos other = (Alunos) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    

}
