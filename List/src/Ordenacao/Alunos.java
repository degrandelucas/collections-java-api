package List.src.Ordenacao;

public class Alunos implements Comparable<Alunos> {

    //Atributos
    private String alunos;
    private int matricula;
    
    //Construtor
    public Alunos(String alunos, int matricula) {
        this.alunos = alunos;
        this.matricula = matricula;
    }

    //Metodos
    //Getters e Setters
    public String getAlunos() {
        return alunos;
    }
    public int getMatricula() {
        return matricula;
    }
    
    public void setAlunos(String alunos) {
        this.alunos = alunos;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //metodo compareTo do Comparable (int pela matrícula)
    @Override
    public int compareTo(Alunos outroAluno) {
        return Integer.compare(this.matricula, outroAluno.getMatricula());
    }

    @Override
    public String toString() {
        return "Alunos [alunos=" + alunos + ", matricula=" + matricula + "]";
    }    
    
}
