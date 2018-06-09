package array_1;

import java.util.Scanner;

public class ArrayTest_3 {
	public static void main(String[] args) {
		//배열의 특징
		//배열의 크기는 미리 정해야 하고
		//한번 만들어진 배열의 크기는 수정이 불가능
		//int []ar=new int[3];
		//ar =new int [2];
		//학생의 이름을 담을 배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 수를 입력하세요.");
		
		//배열의 크기를 담아내는 변수 배열명.length
		int number=sc.nextInt();
		String [] student=new String[number];
		for(int i=0;i<student.length;i++) {
			System.out.println(i+1+"번째 이름 입력");
			student[i]=sc.next();
		}
		
		for(int i=0;i<number;i++) {
			System.out.println(student[i]);
		}
		
	}
}
