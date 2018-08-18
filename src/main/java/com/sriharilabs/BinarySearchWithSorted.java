package com.sriharilabs;

//Java implementation of recursive Binary Search
class BinarySearchWithSorted
{
// Returns index of x if it is present in arr[l..
// r], else return -1
int binarySearch(int arr[], int l, int r, int find_x)
{
   if (r>=l)
   {
       int mid = l + (r - l)/2;

       // If the element is present at the 
       // middle itself
       if (arr[mid] == find_x)
          return mid;

       // If element is smaller than mid, then 
       // it can only be present in left subarray
       if (arr[mid] > find_x)
          return binarySearch(arr, l, mid-1, find_x);

       // Else the element can only be present
       // in right subarray
       return binarySearch(arr, mid+1, r, find_x);
   }

   // We reach here when element is not present
   //  in array
   return -1;
}

// Driver method to test above
public static void main(String args[])
{
	 BinarySearchWithSorted ob = new BinarySearchWithSorted();
   int arr[] = {1,3,4,5,6,8,10,40};
   int n = arr.length;
   int x = 3;
   int result = ob.binarySearch(arr,0,n-1,x);
   if (result == -1)
       System.out.println("Element not present");
   else
       System.out.println("Element found at index " + 
                                            result);
}
}