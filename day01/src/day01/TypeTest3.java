package day01;

public class TypeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte tt = 30;
		long c = 20;
		double r=20.3f;
		// float r2=30.2; double을 float으로 형변환하ㅕ고해서 컴파일 에러 float r2=(float)30.2;
		
		byte a = 20;
		byte b = 10;
		int tot = a+b;
		System.out.println(tot);
		
		char ch='a';
		int digit=ch;
		System.out.println(digit);
		
		int su = 10;
		int su2 = 3;
		
		double su3=su/su2;
		System.out.println(su3);
		
		double su4=(double)su/su2;
		double su5=(double)(su/su2);
		System.out.println("====================");
		System.out.println(su4);
		System.out.println(su5);
		System.out.println("====================");
		
		
		
	}

}
