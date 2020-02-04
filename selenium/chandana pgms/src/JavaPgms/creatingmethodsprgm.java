package JavaPgms;

class myclass{
	void m1(){
		System.out.println("welcome");
	}
	void m2(){
		System.out.println("good mrg");
	}
	void m3(){
		System.out.println("bye");
	}
}
class myclass2{
	void m4(){
		System.out.println("manual");
	}
	void m5(){
		System.out.println("automation");
	}
}

public class creatingmethodsprgm {

	public static void main(String[] args) {
		
		myclass obj=new myclass();
		myclass2 obj1=new myclass2();
		obj.m1();
		obj.m2();
		obj.m3();
		obj1.m4();
		obj1.m5();
		

	}

}
