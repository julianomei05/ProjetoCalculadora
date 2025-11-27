package calculadora;

/**
 * Classe responsável por executar testes simples da classe {@link Calculadora}.
 * <p>
 * Esta classe contém o método principal (main) que realiza diversas
 * operações matemáticas para validar se a calculadora está funcionando
 * corretamente.
 * </p>
 *
 * <p>Os testes incluem:</p>
 * <ul>
 *     <li>Operações válidas (+, -, *, /)</li>
 *     <li>Teste de divisão por zero</li>
 *     <li>Teste de operador inválido</li>
 * </ul>
 *
 * @author SEU_NOME
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Método principal da classe de teste.
     * Executa chamadas ao método {@link Calculadora#calc(int, int, String)}
     * e imprime os resultados esperados.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Testes rápidos
        calc.calc(a: 2, b: 3, op: "+");   // esperado: 5
        calc.calc(a: 10, b: 4, op: "-");  // esperado: 6
        calc.calc(a: 3, b: 5, op: "*");   // esperado: 15
        calc.calc(a: 8, b: 2, op: "/");   // esperado: 4
        calc.calc(a: 8, b: 0, op: "/");   // divisao por zero
        calc.calc(a: 5, b: 5, op: "x");   // operação inválida
    }
}
SS
