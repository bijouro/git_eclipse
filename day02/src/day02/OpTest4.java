package day02;

public class OpTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int su=70;
		
		String result= (su>60)? "�հ�": "���հ�";//���ǿ�����,���׿�����
		System.out.println(result);
		//System.out.println("�հ�"):System.out.println("���հ�");
		
		int su1=3,su2=6,su3=10;
		int max,min;
		//���׿����ڸ� �̿��ؼ�
		max=su1>=su2? su1:su2;
		max=max>=su3? max:su3;
		
		min=su1<=su2? su2:su1;
		min=min<=su3? min:su3;
	
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}

}
