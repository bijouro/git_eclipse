package day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
          
           
		int count;
		
		System.out.println("인원:");
		count=Integer.parseInt(in.readLine());
		
		String[] name = new String[count];
		int[] age = new int[count];
		
		for(int i=0 ; i < count ; i++) {
			
			System.out.println("name:");
			name[i]=in.readLine();
			System.out.println("age:");
			age[i]=Integer.parseInt(in.readLine());
			
		}
		
		for(int i = 0 ; i < count; i++) {
			System.out.printf("이름: %s \t\t 나이: %d\n", name[i], age[i] );	
		}
			
	}

}
