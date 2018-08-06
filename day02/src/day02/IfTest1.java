package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class IfTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int sum;
		//int average;
		double average = 0;
		
//		float f = 0.55555f;
//		String average = String.format("%.2f", f);
//		System.out.println("average="+average);

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input name");
		String name=in.readLine();
		System.out.println("국어 점수");
		int kor=Integer.parseInt(in.readLine());
		System.out.println("영어 점수");
		int eng=Integer.parseInt(in.readLine());
		System.out.println("수학 점수");
		int mat=Integer.parseInt(in.readLine());
		System.out.printf("d2 =%.2f\n",average);
		
		
		sum=kor+eng+mat;
		average=(double)(sum/3);
		System.out.println("총점:"+sum);
		System.out.println("평균:"+average);
		System.out.println("name:"+name);
		
		switch(kor/10)
		{
		case 9:
		System.out.println("등급:A,kor:"+kor);
		break;
		case 8:
			System.out.println("등급:B,kor:"+kor);
			break;
		case 7:
			System.out.println("등급:C,kor:"+kor);
			break;
		case 6:
			System.out.println("등급:D,kor:"+kor);
			break;
		
		}
		switch(eng/10)
		{
		case 9:
		System.out.println("등급:A,eng:"+eng);
		break;
		case 8:
			System.out.println("등급:B,eng:"+eng);
			break;
		case 7:
			System.out.println("등급:C,eng:"+eng);
			break;
		case 6:
			System.out.println("등급:D,eng:"+eng);
			break;
		}
		switch(mat/10)
		{
		case 9:
		System.out.println("등급:A,mat:"+mat);
		break;
		case 8:
			System.out.println("등급:B,mat:"+mat);
			break;
		case 7:
			System.out.println("등급:C,mat:"+mat);
			break;
		case 6:
			System.out.println("등급:D,mat:"+mat);
			break;
		
		}
	}

	private static void alert(double d) {
		// TODO Auto-generated method stub
		
	}

}
