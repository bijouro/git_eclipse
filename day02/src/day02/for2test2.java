package day02;

public class for2test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i=1;i<=1;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("2"+"*"+j+"="+(2*j));
				System.out.print("\t"+"3"+"*"+j+"="+(3*j));
				System.out.println();
			}
			
		}*/
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++);
				
			}
			System.out.println();
		}
	}

}
