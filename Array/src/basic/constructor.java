package basic;

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		a x=new a(2);
		a a=new a();
		
	}

}
class a						//Constructor overloading
{
	public a() 				//Default constructor
	{
		System.out.println("constructor executed");	
	}
	
	public  a(float a)			//Constructor with parameter
	{
		System.out.println("parameter constructor executed ");
	}
}

