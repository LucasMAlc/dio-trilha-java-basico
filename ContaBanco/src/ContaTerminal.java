import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Informações
        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o numero: ");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        
        //Imprimindo os dados obtidos
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponével para saque.");
        
        scanner.close();
    }
}

