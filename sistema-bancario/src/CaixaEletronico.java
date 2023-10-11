import java.util.Scanner;

public class CaixaEletronico {

    public static final String MENSAGEM_DEPOSITO_INVALIDO = "Valor inválido para depósito";
    public static final String MENSAGEM_SAQUE_INVALIDO = "Valor inválido para saque";
    public static final String MENSAGEM_SALDO_INSUFICIENTE = "Saldo insuficiente para realizar o saque";
    public static final String MENSAGEM_CODIGO_INVALIDO = "Código de operação inválido";

    static double extrato = 2000.0;

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Que operação deseja realizar?\n1 - Saque\n2 - Deposito");

            System.out.println("Digite o código da operação desejada");
            int codigoOperacao = scanner.nextInt();

            if (codigoOperacao == 1) {
                System.out.println("Digite o valor que deseja sacar");
                double valorSaque = scanner.nextDouble();
                try {
                    sacar(valorSaque);
                } catch (ValorInvalido exception) {
                    System.out.println(MENSAGEM_SALDO_INSUFICIENTE);
                }
            } else if (codigoOperacao == 2) {
                System.out.println("Digite o valor que deseja depositar");
                double valorDeposito = scanner.nextDouble();
                try {
                    depositar(valorDeposito);
                } catch (ValorInvalido exception) {
                    System.out.println(MENSAGEM_DEPOSITO_INVALIDO);
                }
            } else {
                System.out.println(MENSAGEM_CODIGO_INVALIDO);
            }
        }
    }

    public static void depositar(Double valorDeposito) throws ValorInvalido {
        if (valorDeposito > 0) {
            extrato += valorDeposito;
            System.out.println("Valor de " + valorDeposito + " depositado com sucesso. Saldo atual: " + extrato);
        } else {
            throw new ValorInvalido(MENSAGEM_DEPOSITO_INVALIDO);

        }
    }

    public static void sacar(Double valorSaque) throws ValorInvalido {
        if (valorSaque > extrato) {
            throw new ValorInvalido(MENSAGEM_SAQUE_INVALIDO);
        } else if (valorSaque <= 0) {
            throw new ValorInvalido(MENSAGEM_SAQUE_INVALIDO);
        } else {
            extrato -= valorSaque;
            System.out.println("Saque de " + valorSaque + " realizado com sucesso. Saldo atual: " + extrato);
        }
    }
}
