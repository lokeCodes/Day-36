// https://www.codechef.com/problems/AORB
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int a1 = 500-(2*x);
		    int b1 = 1000-(4*(x+y));
		    int a2 = 500-(2*(x+y));
		    int b2 = 1000-(4*y);
		    int res1 = a1+b1;
		    int res2 = a2+b2;
            if(res1==res2 || res1>res2){
                System.out.println(res1);
            }else{
                System.out.println(res2);
            }
		}
	}
}
