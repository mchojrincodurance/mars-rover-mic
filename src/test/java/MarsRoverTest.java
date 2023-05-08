import org.junit.jupiter.api.Test;

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
}
