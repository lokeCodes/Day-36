// https://www.codechef.com/problems/CYCLICQD
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
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    int d = s.nextInt();
		    int res1 = a+c;
		    int res2 = b+d;
		    String res = (res1==180 && res2==180) ? "YES" : "NO";
		    System.out.println(res);
		}
	}
}
