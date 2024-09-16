package List.src.Pesquisa;

import java.util.Comparator;

public class ComparatorOrdemDecrescente implements Comparator<Numeros>{

    @Override
    public int compare(Numeros numero1, Numeros numero2) {
        return Integer.compare(numero2.getNumeroInteiro(), numero1.getNumeroInteiro());
    }
    
}
