package List.src.Ordenacao;

import java.util.Comparator;

public class ComparatorPorNome implements Comparator<Alunos> {

    @Override
    public int compare(Alunos aluno1, Alunos aluno2) {
        return aluno1.getAlunos().compareTo(aluno2.getAlunos());
    }
    
}
