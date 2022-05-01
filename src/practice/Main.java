package practice;

public class Main implements I1,I2,I3 {

	
	
	
	public static void main(String[] args)
	{
		Main obj=new Main();
		obj.test();
		obj.test2();
	}

	public void test2() {

		System.out.println("test2 called");
	}

	@Override
	public void test() {
		System.out.println("test get called");
	}

	@Override
	public void test5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test6() {
		// TODO Auto-generated method stub
		
	}
}
