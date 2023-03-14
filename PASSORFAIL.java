// https://www.codechef.com/problems/PASSORFAIL
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
		    int n = s.nextInt();
		    int x = s.nextInt();
		    int p = s.nextInt();
		    int res1 = n-x;
		    int res2 = 3*x;
		    int marks = res2 - res1;
		    String result = marks>=p ? "PASS" : "FAIL";
		    System.out.println(result);
		}
	}
}
