import PacoteLampada.Lampada;

public static void main (String [] args) {
    Lampada l1 = new Lampada ();
    l1.ligar ();
    boolean ligado = l1.estaLigado ();
    System.out.println("Lampada ligada?  " + ligado);
    double pot = l1.qualPotencia();
    System.out.println("Potencia da lampada  " + pot);
    boolean trocar = l1.devoTrocar();
    System.out.println("Devo trocar a lampada? " + trocar);
}
