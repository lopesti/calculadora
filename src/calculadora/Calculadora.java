package calculadora;

public class Calculadora {

    // MUDANÇA 1: Mudar o tipo do atributo para double
    double resultado = 0;

    public double somar(int n1, int n2) {
        resultado = n1 + n2;
        return resultado;
    }

    public double subtrair(int n1, int n2) {
        resultado = n1 - n2;
        return resultado;
    }

    public double multiplicar(int n1, int n2) {
        resultado = n1 * n2;
        return resultado;
    }

    public double dividir(int n1, int n2) {

    double d1 = Double.valueOf(n1);
    double d2 = Double.valueOf(n2);

    double r = d1 / d2;
    return r;

  }
}