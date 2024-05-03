import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int numeroAgencia = scanner.nextInt();
        System.out.println("Por favor, digite a Agência !");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome do usuário!");
        String nomeUsuario = scanner.next();
        String sobrenome = scanner.next();
        String nomeCliente = nomeUsuario.concat(" ").concat(sobrenome);
        System.out.println("Por favor, digite o saldo do conta!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "
                +agencia+", conta "+numeroAgencia+" e seu saldo "+saldo+ "já está disponível para saque.");
        scanner.close();
    }
}
