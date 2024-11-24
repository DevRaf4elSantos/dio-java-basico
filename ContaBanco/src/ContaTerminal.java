import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da sua agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o valor do seu saldo ex: 127.50");
        Double saldoConta =  scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma nova conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo é R$" + saldoConta + " já está disponível para saque.");
    }

}
