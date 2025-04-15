import PacoteLampada.Lampada;
import PacoteLampada.SistemaIlumina;

public class UsaSistemaIlumina {
    public static void main(String[] args) {
        SistemaIlumina sistema = new SistemaIlumina(5); // capacidade 5

        // Adiciona 5 lâmpadas com potências e limites diferentes
        sistema.adicionaLampada(60, 3); // Lampada 0
        sistema.adicionaLampada(75, 2); // Lampada 1
        sistema.adicionaLampada(40, 1); // Lampada 2
        Lampada l3 = new Lampada(60, 3);
        Lampada l4 = new Lampada(75, 2);
        sistema.adicionaLampada(l3);
        sistema.adicionaLampada(l4);

        // Liga e desliga algumas vezes pra simular uso
        sistema.ligar(0); sistema.desligar(0); // 1 ciclo
        sistema.ligar(1); sistema.desligar(1); // 1 ciclo
        sistema.ligar(1); sistema.desligar(1); // 2 ciclos
        sistema.ligar(2); sistema.desligar(2); // 1 ciclo
        sistema.ligar(2); sistema.desligar(2); // 2 ciclos → já passou do limite 1
        sistema.ligar(4); sistema.desligar(4); // 1 ciclo
        sistema.ligar(4); sistema.desligar(4); // 2 ciclos → passou do limite 1

        // Verificar quais precisam ser trocadas
        int[] trocar = sistema.verificar();

        System.out.println("Lâmpadas que precisam ser trocadas:");
        for (int i = 0; i<trocar.length; i++) {
            System.out.println(" - Lampada " + trocar[i]);
        }
    }
}
