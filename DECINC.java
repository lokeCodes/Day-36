// https://www.codechef.com/problems/DECINC
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n%4==0){
		    ++n;
		    System.out.println(n);
		}else{
		    --n;
		    System.out.println(n);
		}
	}
}
