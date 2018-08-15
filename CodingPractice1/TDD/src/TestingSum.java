import static org.junit.Assert.*;

import org.junit.Test;

public class TestingSum {

	@Test
	public void TestForInt() {
		SumUp Sum = new SumUp();
		Sum.SumUp(1, 3);
		assertequal(4 ,Sum.SumUp(1,3));
	}
	public void test_for_negative(){
		Sumup Sum = new SumUp();
		
	}

	

}
