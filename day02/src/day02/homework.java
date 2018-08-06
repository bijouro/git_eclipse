package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ÀÔ·Â¼ö:");
		int n=Integer.parseInt(in.readLine());
		
		
		
		for(int i=1;i<=n/2;i++)
		{
			
					System.out.printf("+"+"*",+i);
					//System.out.printf("*",+i);
		}
					while(n%2==1)
					{
						System.out.println("+");
						break;
		}
		
		
	}

}
