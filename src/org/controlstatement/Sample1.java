package org.controlstatement;

public class Sample1 {
	public static void main(String[] args) {
		for (int i = 10; i < 15; i++) {
			System.out.println(i);
			
		}
	}

}


//1         2         3           4
//  ini      cond       logic      inc/dec
//  i=10     i<5        print(i)   i++=i+1
//  i=10     i<15=t      10         10+1=11
//  i=11     11<15=t     11         11+1=12
//  i=12     12<15=t     12         12+1=13
//  i=13     13<15=t     13         13+1=14
//  i=14     14<15=t     14         14+1=15
//  i=15     15<15=f..........................
