package example1;

//Private classes in Java 

//1. Top level class can't be private.
//2. Members can be private inside the class, but class won't be private (in case of only one class).
//3. Nested classes can be private (except top level class).

class Test{
	private int a=1;
	public void show() {
		Rest ob = new Rest();
		System.out.println(ob.c);
	}
	private class Rest{
		int c=10;
	}
}

public class PrivateClass {

	public static void main(String[] args) {
		
		Test ob = new Test();
		//System.out.println(ob.a); -> a is private 
		ob.show();
	}
}
