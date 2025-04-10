import java.util.Scanner;

public class cronologia2 {    
    public static void main(String[] args) {
        
        Scanner scanf = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = scanf.nextInt();
        
        System.out.print("Digite o mês: ");
        int mes = scanf.nextInt();
        
        System.out.print("Digite o ano: ");
        int ano = scanf.nextInt();
        
        if (validarData(dia, mes, ano)) {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida.\n");
        } else {
            System.out.println("A data não é válida.\n");
        }
        scanf.close();
    }
    
    public static boolean validarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) return false;
        if (dia < 1 || dia > 31) return false;
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)) return false;
        if (mes==2) {
            if (dia > 29 || dia == 29 && (!bissexto (ano))) return false;
        }
        return true;  // data válida
    }

    public static boolean bissexto (int ano) {
        if ((ano % 4 == 0 && (ano % 100 != 0)) || ano % 400 == 0) return true;
        return false;
    }
}
