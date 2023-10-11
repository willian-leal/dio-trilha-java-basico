public class ValorInvalido extends Exception {
    public ValorInvalido(String mensagem) {
        super(mensagem);
    }

    public static void validarSaque(double saldo, double valorSaque) throws ValorInvalido {
        if (valorSaque > saldo) {
            throw new ValorInvalido("Saque inválido: valor excede o saldo disponível.");
        }
    }

    public static void validarDeposito(double valorDeposito) throws ValorInvalido {
        if (valorDeposito <= 0) {
            throw new ValorInvalido("Depósito inválido: o valor deve ser maior que zero.");
        }
    }
}
