package com.sriharilabs;

//Java code for linearly search x in arr[].  If x 
//is present  then return its  location,  otherwise
//return -1
class LinearSearch
{
 // This function returns index of element x in arr[]
	
	public static void main(String as[]) {
		LinearSearch ob = new LinearSearch();
	     int arr[] = {8,5,1,7,3,4,10,40};
	     int n = arr.length;
	     int x = 5;
	     int result = ob.search(arr,n,x);
	     if (result == -1)
	         System.out.println("Element not present");
	     else
	         System.out.println("Element found at index " + 
	                                              result);
	 }
	
  int search(int arr[], int n, int x)
 {
     for (int i = 0; i < n; i++)
     {
         // Return the index of the element if the element
         // is found
         if (arr[i] == x)
             return i;
     }

     // return -1 if the element is not found
     return -1;
 }
} 
