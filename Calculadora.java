package calculadora;

/**
 * Classe responsável por realizar operações aritméticas básicas.
 * <p>
 * Esta classe implementa os métodos necessários para executar
 * soma, subtração, multiplicação e divisão entre dois valores inteiros.
 * Também contém um método central {@link #calc(int, int, String)}
 * que decide qual operação será realizada com base no operador informado.
 * </p>
 *
 * <p>Exemplo de uso:</p>
 * <pre>
 *     Calculadora c = new Calculadora();
 *     int resultado = c.calc(10, 5, "+");
 * </pre>
 *
 * @author SEU_NOME
 * @version 1.0
 */
public class Calculadora {

    /**
     * Armazena o resultado da última operação realizada.
     */
    public int r = 0;

    /**
     * Executa uma operação aritmética entre dois números inteiros
     * com base no operador fornecido.
     *
     * <p>Operadores válidos:</p>
     * <ul>
     *     <li>"+" — soma</li>
     *     <li>"-" — subtração</li>
     *     <li>"*" — multiplicação</li>
     *     <li>"/" — divisão</li>
     * </ul>
     *
     * <p>Caso o operador seja inválido, ou ocorra divisão por zero,
     * uma mensagem de erro é exibida.</p>
     *
     * @param a valor 1 da operação
     * @param b valor 2 da operação
     * @param op operador desejado
     * @return resultado da operação solicitada
     */
    public int calc(int a, int b, String op) {

        //Calculadora
        if (op.equals("+")) {
            r = a + b;
        } else if (op.equals("-")) {
            r = a - b;
        } else if (op.equals("*")) {
            r = a * b;
        } else if (op.equals("/")) {
            if (b != 0) {
                r = a / b;
            } else {
                System.out.println("Erro: divisao por zero, operação irregular");
                r = 0;
            }
        } else {
            System.out.println("Operacao invalida");
        }

        System.out.println("Resultado = " + r);
        return r;
    }
}
S


