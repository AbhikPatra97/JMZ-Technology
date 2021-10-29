package basic;

public class CountingObject {
	static int i=0;

	public CountingObject() {
		// TODO Auto-generated constructor stub
		i++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingObject obj1=new CountingObject();
		CountingObject obj2=new CountingObject();
		CountingObject obj3=new CountingObject();
		CountingObject obj4=new CountingObject();
		CountingObject obj5=new CountingObject();
		obj5.counter();
	}
	
	public void counter() {
		System.out.println(i);
		
	}

}
