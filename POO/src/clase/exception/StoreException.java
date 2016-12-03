package clase.exception;

/**
 *  Heredamos de una excepción no verificada para que no se tenga que checkear
 *  Las verificadas las tiene que capturar el compilador
 * */
public class StoreException extends RuntimeException{

	public StoreException(String message) {
		super(message);
	}
	
}
