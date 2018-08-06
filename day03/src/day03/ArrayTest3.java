package day03;

import java.io.IOException;

public class ArrayTest3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[][] arr = {{10,20,30},{40,50,60}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
