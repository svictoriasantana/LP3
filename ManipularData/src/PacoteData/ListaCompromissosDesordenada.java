package PacoteData;

public class ListaCompromissosDesordenada {
    int capacidade;
    int tam = 0;
    DataV5 [] lista;
    
    //Comp = compromisso

    public ListaCompromissosDesordenada (int capacidade) {
        this.capacidade = capacidade;
        lista = new DataV5 [capacidade];
    }

    public ListaCompromissosDesordenada () {
        capacidade = 10;
        lista = new DataV5 [capacidade];
    }

    public int addComp (DataV5 data) {
        if (tam >= capacidade) return -1;
        if (VerificaComp (data) == false) {
            lista [tam++] = data;
            return 1;
        } else {
            return 0;
        }
    }

    public boolean desmarcarComp (DataV5 data) {
        if (VerificaComp (data) == true) {
            for (int i = 0; i<tam; i++) {
                if (data.igualA(lista [i])) {
                    lista [i] = lista [tam-1];
                    lista [tam - 1] = null; 
                    tam--;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean VerificaComp (DataV5 data) {
        if (tam==0) return false;
        for (int i = 0; i<tam; i++) {
            if (data.igualA (lista[i])) return true;
        }
        return false;
    }

    public void listaComp () {
        for (int i = 0; i<tam; i++) {
            System.out.println ("\nCompromisso " + (i+1) + ":");
            lista[i].mostraData ();
        }
    }
}
