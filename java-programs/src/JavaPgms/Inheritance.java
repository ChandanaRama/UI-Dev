package JavaPgms;

class demo1{
	void var1(){
		System.out.println("manual testing");
	}
	void var2(){
		System.out.println("Autmomation");
	}
}
class demo2 extends demo1{
	void m1(){
		System.out.println("selenium");
	}
	void m2(){
		System.out.println("QTP");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2 obj=new demo2();
		obj.m1();
		obj.m2();
		obj.var1();
		obj.var2();

	}

}
