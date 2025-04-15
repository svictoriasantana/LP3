package PacoteData;

public class DataV5 {

    // Encapsulamento public
    private byte dia;
    private byte mes;
    private short ano;

     
    public DataV5() {    //Construtor para definir a data inicial padrão
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    public DataV5(DataV5 outraData) {
        dia = outraData.dia;
        mes = outraData.mes;
        ano = outraData.ano;
    }

    public DataV5(DataV5 outraData, int dias) {   //Adicionar dias à data fornecida
        this (outraData); //Chama o construtor para inicializar data
        for (int i = 0; i < dias; i++) {
            dia++;
            if (!dataValida(dia, mes, ano)) {
                dia = 1;
                mes++;
                if (!dataValida(dia, mes, ano)) {
                    mes = 1;
                    ano++;
                }
            }
        }
    }

    public DataV5(byte dia, byte mes, short ano) {
        this();                              //Chama o construtor sem parâmetros para inicializar data
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } 
    }
    
    public boolean inicializaData(byte d, byte m, short a) {    //inicializa data com dados fornecidos, se válidos
        if (!dataValida(d, m, a)) {
            return false;
        }
        dia = d;
        mes = m;
        ano = a;
        return true;
    }

    public static boolean dataValida(byte dia, byte mes, short ano) {
        byte diasMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (ano < 0) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > diasMes[mes-1]) {   //valida se o dia existe no mês fornecido
            return false;
        }

        // ano bisexto
        if (mes == 2 && dia == 29) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }  

    /* O método "set" atribui um valor ao campo correspondente 
       e o método "get" retorna o valor do campo correspondente */

    public byte getDia() {
        return dia;
    }

    public byte getMes() {
        return mes;
    }

    public short getAno() {
        return ano;
    }

    public boolean setDia(byte d) {
        if (dataValida(d, mes, ano)) {
            dia = d;
            return true;
        } else {
            return false;
        }
    }

    public boolean setMes(byte m) {
        if (dataValida(dia, m, ano)) {
            mes = m;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAno(short a) {
        if (dataValida(dia, mes, a)) {
            ano = a;
            return true;
        } else {
            return false;
        }   
    }

    public boolean igualA(DataV5 outraData) {
        if (dia == outraData.dia && mes == outraData.mes && ano == outraData.ano) {
            return true;
        } else {
            return false;
        }
        
    }

    public static boolean igualA(DataV5 data1, DataV5 data2) {
        if (data1.dia == data2.dia && data1.mes == data2.mes && data1.ano == data2.ano) {
            return true;
        } else {
            return false;
        }
    }

    public boolean diferenteDe(DataV5 outraData) {
        if (dia != outraData.dia || mes != outraData.mes || ano != outraData.ano) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean diferenteDe(DataV5 data1, DataV5 data2) {
        if (data1.dia != data2.dia || data1.mes != data2.mes || data1.ano != data2.ano) {
            return true;
        } else {
            return false;
        }
    }

    // menorQue
    public boolean anterior(DataV5 outraData) {
        if (ano < outraData.ano) return true;
        if (ano > outraData.ano) return false;

        if (mes < outraData.mes) return true;
        if (mes > outraData.mes) return false;

        if (dia < outraData.dia) return true;
        else {return false;}
        //return dia < outraData.dia;
    }

    // menorQue
    public static boolean anterior(DataV5 data1, DataV5 data2) {
        if (data1.ano < data2.ano) return true;
        if (data1.ano > data2.ano) return false;

        else if (data1.mes < data2.mes) return true;
        else if (data1.mes > data2.mes) return false;

        if (data1.dia < data2.dia) return true;
        else {return false;}
        //return data1.dia < data2.dia;
    }

    // maiorQue
    public boolean posterior(DataV5 outraData) {
        if (ano > outraData.ano) return true;
        if (ano < outraData.ano) return false;

        if (mes > outraData.mes) return true;
        if (mes < outraData.mes) return false;

        if (dia > outraData.dia) return true;
        else {return false;}
    }
    // maiorQue
    public static boolean posterior(DataV5 data1, DataV5 data2) {
        if (data1.ano > data2.ano) return true;
        if (data1.ano < data2.ano) return false;

        if (data1.mes > data2.mes) return true;
        if (data1.mes < data2.mes) return false;

        else if (data1.dia > data2.dia) return true;
        else {return false;}
    }

    public boolean maiorOuIgual(DataV5 outraData) {
        if (posterior(outraData) || igualA(outraData)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean maiorOuIgual(DataV5 data1, DataV5 data2) {
        if (posterior(data1, data2) || igualA(data1, data2)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean menorOuIgual(DataV5 outraData) {
        if (anterior(outraData) || igualA(outraData)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean menorOuIgual(DataV5 data1, DataV5 data2) {
        if (anterior(data1, data2) || igualA(data1, data2)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString () {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return dia + " de " + meses [mes-1] + " de " + ano;
    }

}
