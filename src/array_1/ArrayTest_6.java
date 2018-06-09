package array_1;

import java.util.Scanner;

public class ArrayTest_6 {
	public static void main(String[] args) {

		int []ar= {10,25,30,56,72};

		Scanner sc= new Scanner(System.in);
		System.out.println("1.마지막 인덱스 삭제");
		System.out.println("2.마지막 인덱스 추가");
		int select=sc.nextInt();

		if(select==1) {
			int []ar2= new int[ar.length-1];
			for(int i=0;i<ar2.length;i++) {
				ar2[i]=ar[i];
			}

			ar=ar2;	
		}else {
			int []ar2= new int[ar.length+1];
			for(int i=0;i<ar.length;i++) {
				ar2[i]=ar[i];
			}
			System.out.println("데이터 입력");
			ar2[ar2.length-1]=sc.nextInt();
			ar=ar2;
		}



		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
}
