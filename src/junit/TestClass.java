package junit;

import org.junit.Test;

public class TestClass {
	@Test
	public void test(){
		chen chen = new chen();
		int n1 =2;
		int n2 = 4;
		int sum  =chen.add(n1, n2);
		System.out.println(sum);
	}

}
