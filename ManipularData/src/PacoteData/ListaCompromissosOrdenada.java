package PacoteData;

/*As datas devem ser armazenadas de forma ordenada, seguindo a ordem cronológica.
A busca de datas na lista deve utilizar uma busca binária. */

public class ListaCompromissosOrdenada {
    int capacidade;
    int tam = 0;
    DataV5 [] lista;

    //Comp = compromisso

public ListaCompromissosOrdenada (int capacidade) {
        this.capacidade = capacidade;
        lista = new DataV5 [capacidade];
}

public ListaCompromissosOrdenada () {
	capacidade = 10;
        lista = new DataV5 [capacidade];
}

    public int addComp (DataV5 data) {
        if (tam >= capacidade) return -1;
        if (VerificaComp (data) == false) {   //se a data ja não existir na lista, add
            int i;
            for (i = tam - 1; i >= 0; i--) {   //percorre do fim até o inicio
                /*se data for anterior à data na posição i da lista, a data[i]
                anda para frente*/
                if (data.anterior (lista[i])) lista [i+1] = lista [i];  
            }
            lista[i+1] = data;
            tam++;
            return 1;
        } else {
            return 0;
        }
    }

    public boolean desmarcarComp (DataV5 data) {
        int indice = buscaBinaria (data);
	    if (indice>=0) {
            	for (int i = indice; i<tam-1; i++) {
			lista [i] = lista [i+1];
		}
		lista[tam-1] = null;
		tam--;
		return true;
        } else {return false;}
    }

    public boolean VerificaComp (DataV5 data) {
        if (buscaBinaria(data)>=0) {
            return true;
        } else {
            return false;
        }
    }

    public int buscaBinaria (DataV5 data) {
        if (tam==0) return -1;
	    int esq = -1;
	    int dir = tam;
	    while (esq < dir - 1) {
		    int meio = (esq + dir)/2;
		    if (data.igualA (lista[meio])) return meio;   
		    if (data.anterior (lista[meio])) dir = meio;  // Se data é anterior ao meio, busca na metade esquerda
		    else esq = meio;                             // Caso contrário, busca na metade direita;
	    }
	    return -1;   //não encontrou
    }

    public void listaComp () {
        for (int i = 0; i<tam; i++) {
            System.out.println ("\nCompromisso " + (i+1) + ":");
            lista[i].mostraData ();
        }
    }
}
