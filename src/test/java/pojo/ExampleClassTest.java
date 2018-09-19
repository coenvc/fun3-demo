package pojo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.model.TestClass;

public class ExampleClassTest {
	ExampleClass testClass = new ExampleClass();
	@Test
	public void itPassesTheTest(){
		Assert.assertTrue(testClass.returnsTrue());
	}
}