package Calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calc(2, 3, "+"));  // 5
        System.out.println(calc.calc(7, 3, "-"));  // 4
        System.out.println(calc.calc(2, 3, "*"));  // 6
        System.out.println(calc.calc(8, 2, "/"));  // 4
    }
}

