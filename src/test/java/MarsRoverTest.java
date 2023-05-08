import net.bytebuddy.agent.VirtualMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

	@Test
	public void shouldExecuteACommand() {
		// Given
		MarsRover rover = new MarsRover();

		// When
		String result = rover.execute("");

		// Then
		assertEquals(result, "");
	}

}
