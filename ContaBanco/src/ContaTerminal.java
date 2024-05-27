import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite sua agência");
        String agenciaCliente = scanner.next();

        System.out.println("Digite o numero da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo que vai transferir para sua nova conta");
        double novoSaldo = scanner.nextDouble();

        

System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco. Sua agência é "+agenciaCliente+", sua conta é "+numeroConta+" e o saldo que está disponível para saque é "+novoSaldo+" reais");
    }
}
