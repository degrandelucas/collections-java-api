package List.Ordenacao;

public class Alunos implements Comparable {

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

    //metodo compareTo do Comparable
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    
    
}
