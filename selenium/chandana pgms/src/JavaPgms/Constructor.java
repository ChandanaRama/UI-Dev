package JavaPgms;

	class myconstructor{
		myconstructor(int a){
		System.out.println(a);	
		}
		myconstructor(int a, int b){
			System.out.println(a+b);
		}
		myconstructor(String x){
			System.out.println(x);
			
		}
	}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myconstructor obj=new myconstructor(10);
		myconstructor obj1=new myconstructor(20,30);
		myconstructor obj2=new myconstructor("hello");
		
		
		
	}

}
