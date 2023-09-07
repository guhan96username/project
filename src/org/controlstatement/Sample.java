package org.controlstatement;

public class Sample {
	public static void main(String[] args) {
		//      1         2      4
		for (int i = 6; i < 9; i++) {
			//3     a        b     d
			for (int j = 3; j < 7; j++) {
				// c
				System.out.println(j);
					}//3
			System.out.println(i);
		}
			
		}
		
// int     cond                    logic                         inc/dec
// 1        2          a      b          c        d          3         4
//int     cond	     int     cond      logic    inc/dec    logic      inc
//i=6     i<9	     j=3     j<7      print(j)   j++      print(i)    i++
	
//i=6     6<9=t      j=3     3<7=t     3        3+1=4          	
//	                 j=4     4<7=t     4        4+1=5
//	                 j=5     5<7=t     5        5+1=6
//                   j=6     6<7=t     6        6+1=7
//                   j=7     7<7=false..................    6        6+1=7
	
//i=7     7<9=t      j=3     3<7=t     3        3+1=4 
//                   j=4     4<7=t     4        4+1=5
//                   j=5     5<7=t     5        5+1=6
//                   j=6     6<7=t     6        6+1=7
//                   j=7     7<7=false..................    7        7+1=8
	
//i=8     8<9=t      j=3     3<7=t     3        3+1=4 
//                   j=4     4<7=t     4        4+1=5
//                   j=5     5<7=t     5        5+1=6
//                   j=6     6<7=t     6        6+1=7
//                   j=7     7<7=false.................. 	8        8+1=9
	
//i=9     9<9=false..................................................................................	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


