package org.jsp.JavaProgram;

import java.util.Scanner;

public class ArmstrongNumber {
	static int power(int base,int exp) {
		int pow=1;
		for(int i=1;i<=exp;i++) {
			pow=pow*base;
		}
		return pow;
	}
	static int count(int m) {
		int c=0;
		while(m!=0) {
			c++;
			m=m/10;
		}
		return c;
	}
public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
	int exp=count(n);
	int rem=0,sum=0;
	int n1=n;
	while(n!=0) {
		rem=n%10;
		sum=sum+power(rem,exp);
		n=n/10;
}
	System.out.println(n1==sum?"Armstrong number":"not Armstrong number");
	
	}
	

}
