package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("����:");
		int sco=Integer.parseInt(in.readLine());
		
		switch(sco/5)
		{
			case 20: case 19: case 18:
				System.out.println("��� : ��");
				break;
			case 17: case 16:
				System.out.println("��� : ��");
				break;
			case 15: case 14:
				System.out.println("��� : ��");
				break;
			case 13: case 12:
				System.out.println("��� : ��");
				break;
			default :
				System.out.println("��� : ��");
				
		}
	}

}
