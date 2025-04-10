import PacoteData.ListaCompromissosOrdenada;
import PacoteData.DataV5;

public class ListaCompromissosO {
    public static void main (String [] args) {
        ListaCompromissosOrdenada lista  = new ListaCompromissosOrdenada(5);
        DataV5 [] datas = {
            new DataV5 ((byte)26,(byte)10,(short)2006),
            new DataV5 ((byte)25,(byte)10,(short)2006),
            new DataV5 ((byte)24,(byte)10,(short)2006),
            new DataV5 ((byte)23,(byte)10,(short)2006),
            new DataV5 ((byte)22,(byte)10,(short)2006),
            new DataV5 ((byte)21,(byte)10,(short)2006)
        };
        
        for (int i = 0; i<datas.length; i++) {
            int add = lista.addComp (datas[i]);
            if (add==1) {
                System.out.println ("Data " + (i+1) + " adicionada com sucesso!");
            } else if (add==-1) {
                System.out.println ("A lista atingiu sua capacidade maxima.");
            }
            else {
                System.out.println ("Data " + (i+1) + " ja existe e não foi adicionada.");
            }
        }
        lista.listaComp (); //sempre chamar pelo OBJETO

        if (lista.desmarcarComp (datas[2]) == true) {
            System.out.println ("\nCompromisso 3 desmarcado com sucesso!");
        } else {
            System.out.println ("Erro ao desmarcar o compromisso 3.");
        }

        System.out.println ("Lista atualizada apos remocao:");
        lista.listaComp ();
    }
}
