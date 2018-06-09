package array_1;

import java.util.Scanner;

public class ArrayTest_5 {
	public static void main(String[] args) {
		//학생의 수를 입력
		//학생의 수만큼 학생의 이름, 국어, 수학, 영어 점수를 차례로 입력받음
		//학생의 이름, 국어, 수학, 영어 차례로

		Scanner sc=new Scanner(System.in);
		System.out.print("학생의 수를 입력해주세요 : ");
		int count=sc.nextInt();	

		String [] names=new String[count];
		int [] kor=new int [names.length];
		int [] math=new int[names.length];
		int [] eng=new int[names.length];


		for(int i=0;i<names.length;i++) {
			System.out.println("이름을 입력해주세요 :");
			names[i]=sc.next();
			System.out.println("국어 점수를 입력해주세요 : ");
			kor[i]=sc.nextInt();
			System.out.println("수학 점수를 입력해주세요 : ");
			math[i]=sc.nextInt();
			System.out.println("영어 점수를 입력해주세요 : ");
			eng[i]=sc.nextInt();
		}


		System.out.println("====================명단 출력====================");

		for(int i=0;i<names.length;i++) {
			System.out.println("이름 : "+names[i]+" 국어 : "+kor[i]+" 수학 : "+math[i]+ " 영어 : "+eng[i]);
		}



	}
}
