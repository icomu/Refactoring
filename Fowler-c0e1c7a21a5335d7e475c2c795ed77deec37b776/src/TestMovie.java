import org.junit.*;
import static org.junit.Assert.*;

public class TestMovie {

	private static Movie jamesBond;

	@BeforeClass
	public static void init() {
		jamesBond = new Movie("James Bond - Spectre", 17);
	}

	@Test
	public void testGetPriceCode() {
		assertEquals(17, jamesBond.getPriceCode());
	}

	@Test
	public void testSetPriceCode() {
		jamesBond.setPriceCode(15);
		assertEquals(15, jamesBond.getPriceCode());
	}

	@Test
	public void testGetTitle() {
		assertEquals("James Bond - Spectre", jamesBond.getTitle());
	}
}