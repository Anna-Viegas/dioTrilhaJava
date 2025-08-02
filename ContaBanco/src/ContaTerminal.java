import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
     
        Scanner leitor = new Scanner(System.in);
        System.out.print("Seu nome: ");
        String NomeCliente= leitor.nextLine();
        System.out.print("Agência Bancária: ");
        String agencia= leitor.nextLine();
        System.out.print("Número da sua conta: ");
        int numero= leitor.nextInt();
        System.out.print("Saldo: ");
        double saldo= leitor.nextDouble();
        System.out.println("Olá, "+NomeCliente+", obrigado por criar uma conta em nosso banco. Sua agência é "+agencia+", conta "+numero+", e seu saldo "+saldo+" já está disponível para saque.");
        leitor.close();
    }
}
