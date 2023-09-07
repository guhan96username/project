package org.controlstatement;

public class Sample2 {
	public static void main(String[] args) {
		for (int i = 20; i > 16; i--) {
			System.out.println(i);
			
			
		}
	}

}
//1         2         3           4
//  ini      cond       logic      inc/dec
//  i=20     i>16       print(i)   i--=i-1
//  i=20     20>16=t     20        20-1=19
//  i=19     19>16=t     19        19-1=18
//  i=18     18>16=t     18        18-1=17
//  i=17     17>16=t     17        17-1=16
//  i=16     16>16=f..........................
