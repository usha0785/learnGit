package priority;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGFileWithoutPriority {
	@Test
	public void c_test() {
		Assert.fail();
	}
	@Test
	public void a_test() {
		Assert.assertTrue(true);
	}
	@Test
	public void b_test() {
		throw new SkipException ("Skipping b test.....");
	}

}
