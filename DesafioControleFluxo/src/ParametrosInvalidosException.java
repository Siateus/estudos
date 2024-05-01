public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(){
        super("Os parâmetros são inválidos. O primeiro parâmetro não pode ser maior que o segundo.");
    }
}
