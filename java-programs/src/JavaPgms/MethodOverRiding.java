package JavaPgms;

class over{
	void m1(){
		System.out.println("Seleinum");
	}
}
class over1 extends over{
	void m1(){
		System.out.println("automation");
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		over1 obj=new over1();
		obj.m1();
		
	}

}
