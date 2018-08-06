package day03;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		int[] arr2;
		arr2=new int[4];
		
		int arr3[];
		arr3 = new int[5];
				
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		System.out.println(arr.length);
		for(int i=0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		for ( int item:arr)
			System.out.println(item);

		for(int i =0 ; i < arr2.length;i++) {
			System.out.println(arr2[i]);
		}
			
		float[] f_arr=new float[3];
		for(float item:f_arr) {
			System.out.println(item);
		}
		
		char[] c_arr=new char[3];
		for(char item:c_arr) {
			System.out.println(item);
		}
		
		System.out.println("=================");
		int [] n_arr = {1123,123,12312};
		for(int item:n_arr)
		System.out.println(item);
		
		String[] name=new String[3];
		name[0] = "hong";
		name[1] = "kim";
		name[2] = "lee";
		for(String i:name)
			System.out.println(i);
		
				
	}

}
