package string;

public class A {
	int a;
	public static void main(String[] args) {
		
		//C c=new C();
		//B b=c;
		
		B b=new B();
		C c=(C) b;
		System.out.println(c.display());

	}
	
	

}
class B extends A{
	int b;
	
	String display(){
		return "B";
	}
}
class C extends B{
	
	int b;
	String display(){
		return "C";
	}
}