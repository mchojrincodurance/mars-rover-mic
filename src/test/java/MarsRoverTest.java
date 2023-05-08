import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MarsRoverTest {

	@Test
	public void shouldExecuteACommand() {
		// Given
		MarsRover rover = new MarsRover();

		// Then
		assertThrows(IllegalArgumentException.class, () -> rover.execute("") );
	}

	@Test
	public void shouldReturn00WIfCommandIsL() {
	    // Given
		MarsRover rover = new MarsRover();

		// When
		String result = rover.execute("L");

		// Then
		assertEquals("0:0:W", result);
	}

	@Test
	public void shouldReturn01NIfCommandIsM() {
		// Given
		MarsRover rover = new MarsRover();

		// When
		String result = rover.execute("M");

		// Then
		assertEquals("0:1:N", result);
	}

	@Test
	public void shouldReturn00EIfCommandIsR() {
		// Given
		MarsRover rover = new MarsRover();

		// When
		String result = rover.execute("R");

		// Then
		assertEquals("0:0:E", result);
	}

	@ParameterizedTest
	@CsvSource(value = {"R;0:0:E", "M;0:1:N", "RR;0:0:S"}, delimiter = ';')
	public void shouldReturnExpectedGivenCommand(String input, String expected) {
		// Given
		MarsRover rover = new MarsRover();

		// When
		String result = rover.execute(input);

		// Then
		assertEquals(expected, result);
	}

}
