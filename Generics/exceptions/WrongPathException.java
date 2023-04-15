package exceptions;

import java.io.IOException;

public class WrongPathException extends IOException {

	private long serialVersionUID = 7818375828146090155L;

	public WrongPathException(String msg, Throwable t) {
		super("Erro ao encontrar o caminho especificado", t);
	}
}
