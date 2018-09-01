package honux.calendar;

import java.util.Scanner;



public class Calendar {
	
	
	public static final int[] Month= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public void printSampleCalendar() {
		
		
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28"); 
		
		
	}
	
	
	public int getMaxDaysOfMonth(int month) {
		
		return Month[month-1];
		
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		Calendar cal=new Calendar();
		
		int input;
		int input_num;
		
		System.out.println("원하는 입력 횟수를 입력하세요:");
		
		input_num=scan.nextInt();
		
		for(int i=0; i<input_num; i++) {
		
		System.out.println("알고 싶은 달을 하나 선택하세요(1월~12월 중): ");
		
		String month_s=scan.next();
		
		input=Integer.parseInt(month_s);		
		
		System.out.printf("%d월은 %d일까지 있습니다.", input, cal.getMaxDaysOfMonth(input) );
		

	}
		scan.close();
}
}
