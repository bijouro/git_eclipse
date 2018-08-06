package day02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("input name");
			String name=in.readLine();
			System.out.println("name:"+name); 
			System.out.println("계속 입력할까요?");
			String yn=in.readLine();
			
			if(yn.equals("n"))
				break;
		}*/
		int tot=0;
		for(int i=1;i<=100;i++)
		{
			tot+=i;
			if(tot>=30) break;
			System.out.println(i);
		}
	}

}
