package org.jsp.JavaProgram;

public class ArmstrongNumber {
	static int power(int base,int ex) {
		int pow=1;
		for(int i=1;i<=ex;i++) {
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

}
