public class ParametrosInvalidosException extends Exception {
    static String validarParametro(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException();
        }
        return null;
    }
}
