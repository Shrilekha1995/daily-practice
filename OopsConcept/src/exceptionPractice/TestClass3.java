package exceptionPractice;



public class TestClass3 {

	
	public static void main(String[] args) throws Exception{
		
		method1();
		/*try{
			badMethod();
			System.out.println("A");
		}catch(Throwable e){
			System.out.println("B");
		}finally{
			System.out.println("C");
		}
		System.out.println("D");
	}

	private static void badMethod() {
		
		throw new Error();
		
	}*/
}

	private static void method1()throws Exception {
		
		method2();
		
	}

	private static void method2()throws Exception  {
	 throw method3();
		
	}

	private static Exception method3() {
		
		return new Exception();
	}
}