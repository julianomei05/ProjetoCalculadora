package calculadora;

public class Calculadora {

    private int r;

    public Calculadora() {
        this.r = 0;
    }

    public int getResultado() {
        return r;
    }

    public int somar(int a, int b) {
        r = a + b;
        return r;
    }

    public int subtrair(int a, int b) {
        r = a - b;
        return r;
    }

    public int multiplicar(int a, int b) {
        r = a * b;
        return r;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        r = a / b;
        return r;
    }

    public int calc(int a, int b, String operador) {
        switch (operador) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}

