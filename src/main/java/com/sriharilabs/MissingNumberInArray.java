package com.sriharilabs;

public class MissingNumberInArray {

	 // Function to ind missing number
    static int getMissingNo (int a[], int n)
    {
        int i, total;
        total  = (n+1)*(n+2)/2;   
        System.out.println("tot:"+total);
        for ( i = 0; i< n; i++) {
           //total -= a[i];
        	total =total- a[i];
         System.out.println(total);  
        }
        return total;
    }
      
    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = {1,5,4,6,3};
        int miss = getMissingNo(a,5);
        System.out.println(miss);   
    }

}
