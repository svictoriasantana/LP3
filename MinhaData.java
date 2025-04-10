public class MinhaData {
    public byte dia, mes;
    public short ano;

    public static void main (String[] args) {
        MinhaData data = new MinhaData();   //Cria uma instância (objeto) da classe MinhaData
        System.out.println (data.dia + "/" + data.mes + "/" + data.ano);
    }

    public static boolean validarData(byte dia, byte mes, short ano) {
        if (ano<1900 || ano>2050) return false;
        if (mes < 1 || mes > 12) return false;
        if (dia < 1 || dia > 31) return false;
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)) return false;
        if (mes==2) {
            if (dia > 29 || dia == 29 && !bissexto (ano)) return false;
        }
        return true;  // data válida
    }

    public static boolean bissexto (short ano) {
        if ((ano % 4 == 0 && (ano % 100 != 0)) || ano % 400 == 0) return true;
        return false;
    }

    public MinhaData () {     // Construtor que define a data para 01/01/1970
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public MinhaData (byte dia, byte mes, short ano) {   //Construtor
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
}
