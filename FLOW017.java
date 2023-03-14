// https://www.codechef.com/problems/FLOW017
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
		    int z = s.nextInt();
		    
		    if(x>y && x>z){
		        System.out.println(Math.min(x,Math.max(y,z)));
		    }else if(y>x && y>z){
		        System.out.println(Math.min(y,Math.max(x,z)));
		    }else{
		        System.out.println(Math.min(z,Math.max(x,y)));
		    }
		
		}
	}
}
