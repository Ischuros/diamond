package diamond.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class DiamondTest {

	@ParameterizedTest
	@ValueSource(strings = {"X", "P", "O"})
	public void testDisplayChar(char toDisplay) {
		Diamond diamond = new Diamond(toDisplay, 3);
		assertEquals(toDisplay, diamond.displayChar());
	}

	@ParameterizedTest
	@ValueSource(ints = {1,3,5,7})
	public void testDisplayLine(int toDisplay) {
		final char toDraw = 'X';
		Diamond diamond = new Diamond(toDraw, 9);
		final String toTest = diamond.displayLine(toDisplay);

		Pattern pattern = Pattern.compile(""+toDraw);
		Matcher matcher = pattern.matcher(toTest);

		int nbFound = 0;
		while (matcher.find()) {
			nbFound++;
		}

		assertEquals(nbFound, toDisplay);
	}

	@ParameterizedTest()
	@ValueSource(ints = {2,4,6,8})
	public void testEvenSize(final int size) {
		assertThrows(EvenNumberException.class, () -> new Diamond('X', size));
	}
}