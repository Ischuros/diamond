package diamond.main;

public class Main {

	private final char toDisplay;
	private final int size;

	public Main(char toDisplay, int size) {
		this.toDisplay = toDisplay;
		this.size = size;
	}

	public char displayChar() {
		return toDisplay;
	}

	public String displayLine(int nbToDisplay) {
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
