package basic;

public class array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,6,7,9};
		int b[]= {3,5,7,9,11};
		int c[]= {11,13,15,17,19};
		
		
		int p[][]= {
				{2,4,6,7,9},
				{3,5,7,9,11},
				{11,13,15,17,19}
				     };
	/*	for (int i=0;i<3;i++)
		{
			for (int j=0;j<=4;j++)
			{
				System.out.print(p[i][j]+" ");	
			}
			System.out.println("");
		}
		*/
		
		
		for (int i[]:p)
		{
			for (int j:i)
			{
				System.out.print(j+" ");
			}System.out.println("");
		}
		

	}

}
