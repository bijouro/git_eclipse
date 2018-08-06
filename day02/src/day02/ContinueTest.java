package day02;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i=1;i<=10;i++)
		{
			if(i%5==0)
			continue;
			//break;
		
		System.out.println(i);
		
		}*/
		
		int cut=-1;
		while(cut<10)

		{
			
			
			cut++;
			if(cut%5==0)
				continue;
			System.out.println(cut);

		}
			System.out.println("Done");

		}
	

}
