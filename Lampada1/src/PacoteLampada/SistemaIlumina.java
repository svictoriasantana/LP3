package PacoteLampada;

public class SistemaIlumina {
    Lampada[] lampadas; 
    int capacidade;
    int tamanho;

    public SistemaIlumina () {
        capacidade = 30;
        lampadas = new Lampada[capacidade];
        tamanho = 0;
    }

    public SistemaIlumina (int capacidade) {
        if (capacidade>30) {
            this.capacidade = 30;
        } else {
            this.capacidade = capacidade;
        }
        lampadas = new Lampada[this.capacidade];
        tamanho = 0;
    }

    public boolean adicionaLampada (Lampada l) {
        if (tamanho>=capacidade) return false;
        lampadas [tamanho++] = l;
        return true;
    }

    public boolean adicionaLampada (int potencia, int limite) {
        if (tamanho>=capacidade) return false;
        Lampada l1 = new Lampada (potencia, limite);
        lampadas [tamanho++] = l1;
        return true;
    }

    public void ligar () {
        for (int i = 0; i<tamanho; i++) {
            lampadas[i].ligar();
        }
    }

    public void ligar (int qual) {
        lampadas[qual].ligar();
    }

    public void desligar () {
        for (int i = 0; i<tamanho; i++) {
            lampadas[i].desligar();
        }
    }

    public void desligar (int qual) {
        lampadas[qual].desligar();
    }

    public int[] verificar () {
        int [] max = new int[tamanho];
        int j = 0;

        for (int i = 0; i<tamanho; i++) {
            if (lampadas[i].devoTrocar()) {
                max [j++] = i;
            }
        }

        int [] trocar = new int[j];
        for (int i = 0; i<j; i++) {
            trocar [i] = max [i];
        }
        return trocar;
    }

    public boolean verificar (int qual) {
        if (lampadas[qual].devoTrocar()) return true;
        return false;
    }
}
