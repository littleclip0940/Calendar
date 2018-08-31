package honux.calendar;

import java.util.Scanner;

public class input {
		
	public static void main(String[] args) {
				
		//31,28,31,30,31,30,31,31,30,31,30,31
		//1,3,5,7,8,10,12월은 31일까지
		//4,6,9,11은 30일까지
		//2월은 28일까지
				
		int a;
		
		System.out.println("달을 입력하세요(1월~12월 중): ");
		
		Scanner scan=new Scanner(System.in);
		
		a=scan.nextInt();
				
		if(a>0 && a<13) {
		
		if(a==2) {			
			
			System.out.printf("%d월은 28일까지 있습니다.",a);
						
		}else if(a==4 || a==6 || a==9 || a==11) {
			
			System.out.printf("%d월은 30일까지 있습니다.",a);
			
		}else {
			
			System.out.printf("%d월은 31일까지 있습니다.",a);			
		}				
		
	}else {
		
		System.out.println("1~12 중 하나를 선택하세요!");
		
	}		
		scan.close();	
}	
}


// 강의 코드
/*
 * int[] month={31,28,31,30,31,30,31,31,30,31,30,31};
 * Scanner scan=new Scanner(System.in);
 * int mday=scan.nextInt();
 * System.out.printf("%d월은 %d일까지 있습니다.",mday, month[mday-1]);
 * scan.close();
 * 
 */



