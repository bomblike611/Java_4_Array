package array_1;

public class ArrayTest_4 {
	public static void main(String[] args) {
		
		int [] ar=new int[3];
		ar[0]=30;
		ar[1]=33;
		ar[2]=40;
		
		int total=0;
		for(int i=0;i<ar.length;i++) {
			total+=ar[i];
		}
		
		System.out.println(total);
		System.out.println(total/ar.length);
	}
}
