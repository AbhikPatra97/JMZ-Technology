package basic;
import java.util.*;
public class basic {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter info");
		
		System.out.println("enter name");
		String name=a.next();
		
		System.out.println("enter roll number");
		int roll=a.nextInt();
		
		System.out.println("enter mail id");
		String mail=a.nextLine();
		
		System.out.println("enter phone number");
		int phno=a.nextInt();
		
		System.out.println("name:"+name+"  roll:"+roll+"  email:"+mail+"  phone number:"+phno);
		//a.close();
	}

}
