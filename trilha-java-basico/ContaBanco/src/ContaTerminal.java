import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência !");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Conta !");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

            System.out.println("Por favor, digite o nome do Cliente !");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da Conta !");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextDouble()

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar o tipo de dado correto.");
        }
    }
}
