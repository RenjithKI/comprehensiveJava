import static org.junit.Assert.*;

import org.junit.Test;

public class OuterClasTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		//System.out.println();
		assertSame("jjjj", OuterClas.StaticNestedClass.sysoutme());
		assertSame("how are you keeping____>", OuterClas.StaticNestedClass.returnWordFrom());
//		//assertSame(expected, actual);
//		assertSame("hi", "hi");
	}

}
