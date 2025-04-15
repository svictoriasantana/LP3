public class Calculadora {
    public static int soma (int a, int b) {
        return a+b;
    }

    public static int soma (int a, int b, int c) {
        return a+b+c;
    }

    public static int subtrai (int a, int b) {
        return a-b;
    }

    public static int multiplica (int a, int b) {
        return a*b;
    }

    public static int divide (int a, int b) {
        if (b==0) return 0;
        return a/b;
    }

    public static void main (String[] args) {
        int soma = Calculadora.soma(10, 5);
        System.out.println (soma);
        soma = Calculadora.soma(10, 5, 2);
        System.out.println (soma);
        int subtrai = Calculadora.subtrai(10, 5);
        System.out.println (subtrai);
        int mult = Calculadora.multiplica(10, 5);
        int div = Calculadora.divide(10, 5);
        System.out.println (mult);
        System.out.println (div);
    }
}
