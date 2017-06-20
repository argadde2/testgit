/*
Penny Auntie, with n dollars to buy chocolates. Each chocolate has a flat cost of c dollars, and the store has a promotion where they allow you to trade in m chocolate wrappers in exchange for  free piece of chocolate.
Given n, m, and c for  trips to the store, can you determine how many chocolates Bobby eats during each trip?
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
		        int q = sc.nextInt();
		        for(int i=0;i<q;i++)
		        {
		        	int n=sc.nextInt();
		        	int c=sc.nextInt();
		        	int m=sc.nextInt();
		        	int count,choc;
		        	choc = (int) Math.floor(n/c);
		        	count =choc;
		        	
		        	while(count>=m){
int count1 = Math.floorDiv(count, m);
		        		count = count1 + count%m;
                          choc += count1;
		        		}
		        	
		        	System.out.println(choc);
		        		
		        }
		        
    }
}

