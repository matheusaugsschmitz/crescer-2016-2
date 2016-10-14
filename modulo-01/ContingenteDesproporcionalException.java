
/**
 * Escreva a descrição da classe ContingenteDesproporcionalException aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ContingenteDesproporcionalException extends Exception{
    public ContingenteDesproporcionalException() {
        super("A proporção dos elfos verdes e noturnos não é de 1/2 para cada.");
    }
    
    public ContingenteDesproporcionalException(String erro) {
        super(erro);
    }
}
