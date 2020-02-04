package JavaPgms;

class meth{
	void m1(){
		System.out.println("selenium");
		
	}
	void m1(int a){
		System.out.println(a);
	}
	void m1(int a,int b){
		System.out.println(a+b);
	}
	void m1(String x){
		System.out.println(x);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth obj=new meth();
		obj.m1();
		obj.m1(10);
		obj.m1(20,30);
		obj.m1("test");
	}

}
