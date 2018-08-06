package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("국어 점수");
		int kor=Integer.parseInt(in.readLine());
		System.out.println("영어 점수");
 		int eng=Integer.parseInt(in.readLine());
		
		/*if(kor>=90&&eng>=90)
			System.out.println("very good");
		else if(kor>=90)
			System.out.println("good");
		else if(eng>=90)
			System.out.println("good");
		else if(kor<90&&eng<90)
			System.out.println("bad");*/
 		
 		if(kor>=90&&eng>=90)
 			System.out.println("very good");
 		
 		else if(kor>=90||eng>=90)
 		{
 			System.out.println("good");
 		}
 		else 
 		{
 			System.out.println("bad");
 		}
 	
 		
		
	}

}
