package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {


	private static final long serialVersionUID = 1L;
	
	//colecao contendo todos os erros possiveis
	private Map<String, String> errors = new HashMap<>();// COLE��O DE CHAVES, PARES, VALOR
		
	public ValidationException(String msg) {
		super(msg);
	}
	
	public Map<String, String> getErrors(){
		return errors;
	}
	
	public void addError(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}
}
