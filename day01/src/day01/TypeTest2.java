package day01;

/*
	primitive type			L,l		F,f
	1byte	2byte 	4byte	8byte	4byte	8byte	 	
	byte	short 	int		long 	float 	double
		
		2byte
  		char
  	
  	undefine
  	boolean
  	
*/
public class TypeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a=20;
		short b=10;
//		byte c=10000;
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
		
		long d=20L;
		long e=20l;
		
		float f=20.2f;
		double g=30.2;
		
		char ch='a';
		System.out.println(ch);
		
		boolean tf=true;
		boolean tf2=false;
		System.out.println(tf);
		System.out.println(tf2);	

		String name ="ewijjfoidsjj";
		System.out.println(name);
	}

}
