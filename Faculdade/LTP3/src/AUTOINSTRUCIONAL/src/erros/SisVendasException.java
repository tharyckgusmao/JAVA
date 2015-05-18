package erros;

	/**
	 * Classe SisVendasException que recebe os atributos como heranca da classe
	 * Exception. Classe para tratativa de erros.
	 */
public class SisVendasException extends Exception {


	/**
	 * Construtor da classe SisVendasException
	 *
	 * @param erro recebe como paramentro uma String, para passagem de valor para os metodos da classe pai.          
	 */
	public SisVendasException(String erro) {

		super(erro);

	}

}
