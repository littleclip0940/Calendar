package honux.calendar;

import java.util.Scanner;


public class Sum {
	
	public static void main(String[] args) {
		
	int a,b;

	Scanner scan=new Scanner(System.in);
	
	//int a=scan.nextInt();
	//int b=scan.nextInt();
	//System.out.println(a+b);
	
	String s1=scan.next();
	String s2=scan.next();
	
	a=Integer.parseInt(s1); //c언어라면 (int)s1처럼 형변환 하면 되지만 자바는 이렇게!
	b=Integer.parseInt(s2);
	
	System.out.printf("%d와 %d의 합은 %d 입니다.",a,b,a+b); //System.out.println(..) 하면 에러나네...?
	scan.close();
	
	}
	
	
}
