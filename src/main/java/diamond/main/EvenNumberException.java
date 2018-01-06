package diamond.main;

public class EvenNumberException extends RuntimeException {

	public EvenNumberException() {
		super("Even number. Can not initialize a Diamond with an even size.");
	}
}
