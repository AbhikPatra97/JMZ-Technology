package basic;
import java.util.Random;


public class ArrayException {
public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Random r=new Random();
			
			int a[]=new int[4];
			
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=r.nextInt(200);	
			}
			
			
			try
			{
				System.out.println(a[0]+" the specific value");
			}
			catch(Exception x)
			{
				System.out.println(" the maximum value is 3 ");
			}
			
			
			for(int i:a)
				System.out.println(i);
			}
	}
