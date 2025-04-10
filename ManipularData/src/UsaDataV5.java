import PacoteData.DataV5;
 
public class UsaDataV5 {
    public static void main(String[] args) {
        DataV5 d1 = new DataV5((byte)1,(byte)1,(short)2000);     //criação de um objeto data d1
        System.out.println ("Data 1:");
        d1.mostraData();
        boolean ok = d1.inicializaData((byte) 1, (byte) 1, (short) 2021);
        if (ok == true)
            d1.mostraData();
        else
            System.out.println("Data inválida!");

        byte d = 14;
        byte m = 7;
        if (DataV5.dataValida(d, m, (short) 2021)) {
            System.out.println("\nData válida! Esta eh a data 1 modificada:");
            d1.setDia(d);
            d1.setMes(m);
        } else {
            System.out.println("Data inválida!");
        }
        
        d1.mostraData();
        
        DataV5 d2 = new DataV5(d1);   //criação de outro objeto data d2
        System.out.println ("\nA data 2 eh: ");
        d2.mostraData();
        DataV5 d3 = new DataV5(d1, 45);   //objeto data d3
        System.out.println ("\nData 3 (data 1 + 45 dias): ");
        d3.mostraData();
        DataV5 d4 = new DataV5();
        System.out.println ("\nData 4 com inicialização padrao: ");
        d4.mostraData();

        boolean igual = DataV5.igualA (d1, d2);
        if (igual == true) {
            System.out.println ("\nData 1 e 2 sao iguais.");       
        }
        igual = d1.igualA (d2);
        if (igual == true) {
            System.out.println ("Data 1 e 2 sao iguais.\n");       
        }


        boolean dif = DataV5.diferenteDe (d1, d3);
        if (dif == true) {
            System.out.println ("\nData 1 e 3 sao diferentes.");       
        }
        dif = d1.diferenteDe (d3);
        if (dif == true) {
            System.out.println ("Data 1 e 3 sao diferentes.\n");       
        }


        boolean ant = DataV5.anterior (d4, d1);
        if (ant == true) {
            System.out.println ("\nA data 4 eh anterior a data 1.");       
        }
        ant = d4.anterior (d1);
        if (ant == true) {
            System.out.println ("A data 4 eh anterior a data 1.\n");       
        }


        boolean pos = DataV5.posterior (d3, d2);
        if (pos == true) {
            System.out.println ("\nA data 3 eh posterior a data 2.");       
        }
        pos = d3.posterior (d2);
        if (pos == true) {
            System.out.println ("A data 3 eh posterior a data 2.\n");       
        }


        boolean maiouigual = DataV5.maiorOuIgual (d3, d1);
        if (maiouigual == true) {
            System.out.println ("\nA data 3 eh maior ou igual a data 1.");       
        }
        maiouigual = d3.maiorOuIgual (d1);
        if (maiouigual == true) {
            System.out.println ("A data 3 eh maior ou igual a data 1.\n");       
        }

        boolean menouigual = DataV5.menorOuIgual (d1, d3);
        if (menouigual == true) {
            System.out.println ("\nA data 1 eh menor ou igual a data 3.");       
        }
        menouigual = d1.menorOuIgual (d3);
        if (menouigual == true) {
            System.out.println ("A data 1 eh menor ou igual a data 3.\n");       
        }
    }
}
