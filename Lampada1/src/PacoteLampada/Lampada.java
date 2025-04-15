package PacoteLampada;

public class Lampada {
    public boolean estado;
    private double potencia;
    public int qligada;
    private int limite;

     public Lampada (){
        estado = false;
        potencia = 15;
        qligada = 0;
        limite = 1000;
    }

    public Lampada (double potencia, int limite) {
        estado = false;
        this.potencia = potencia;
        qligada = 0;
        this.limite = limite;

    }

    public void ligar () {
        if (qligada==limite) {
            System.out.println ("ERRO: limite de ligações atingido!\n");
        } else if (estado==false) {
            estado = true;
            qligada++;
        }
    }

    public void desligar () {
        estado = false;
    }

    public boolean estaLigado () {
        if (estado == true) {
            return true;
        } else {
            return false;
        }
    }

    public double qualPotencia () {
        return potencia;
    }

    public boolean devoTrocar () {
        if (qligada>=limite) {
            return true;
        }else {
            return false;
        }
    }
}