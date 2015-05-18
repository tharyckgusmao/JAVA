package erros;

public class SisVendasException extends Exception {

	/**
	 * Classe SisVendasException que recebe os atributos como heranca da classe
	 * Exception. Classe para tratativa de erros.
	 */

	/**
	 * Construtor da classe SisVendasException
	 *
	 * @param recebe
	 *            como paramentro uma String, para passagem de valor para os
	 *            metodos da classe pai.
	 */
	public SisVendasException(String erro) {

		super(erro);

	}

}
