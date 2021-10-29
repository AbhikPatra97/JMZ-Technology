package basic;

public class ArrayJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,6};
		int b[]= {3,5,7,9};
		int c[]= {1,3,15,7,19};
		
		
		int p[][]= {
				{2,4,6},
				{3,5,7,9},
				{1,3,15,7,19}
				     };
		
		for(int i[]:p)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}System.out.println(" ");
		}

	}

}
