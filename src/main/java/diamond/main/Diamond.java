package diamond.main;

public class Diamond {

	private final char toDisplay;
	private final int size;

	public Diamond(char toDisplay, int size) {
		this.toDisplay = toDisplay;
		this.size = size;
		checkParity();
	}

	private void checkParity() {
		if (size % 2 == 0) {
			throw new EvenNumberException();
		}
	}

	char displayChar() {
		return toDisplay;
	}

	String displayLine(int nbToDisplay) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nbToDisplay; i++) {
			sb.append(toDisplay);
		}

		StringBuilder result = new StringBuilder(sb.toString());
		while (result.length() < size) {
			result = new StringBuilder(" " + result + " ");
		}

		return result.toString();
	}
}
