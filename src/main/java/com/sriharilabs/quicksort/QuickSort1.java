package com.sriharilabs.quicksort;

import java.util.Arrays;

public class QuickSort1 {

	public static void main(String[] args) {

		QuickSort1 q=new QuickSort1();
		
		//int arr[]={3, 17, 8, 12};   
		int arr[]= {4,3,1,5 ,2 ,7 ,6};
		
		Arrays.stream(arr).forEach(s->System.out.print("\t"+ s));
		q.quickSort(arr,0,arr.length-1);
		System.out.println("\n \t--------------------------");
		Arrays.stream(arr).forEach(s->System.out.print("\t"+s));
	}

	
	int partition(int arr[], int left, int right)

	{

	      int i = left, j = right;

	      int tmp;

	      int pivot = arr[(left + right) / 2];
	      System.out.println("\n \n Pivotol :: "+pivot+"     i: "+i    +"     j :"+j+"\n");
	     

	      while (i <= j) {

	    	 //System.out.println("     i: "+i    +"     j :"+j+ "     arr[i] < pivot " + arr[i]+"<"+pivot);
	            while (arr[i] < pivot) {

	                  i++;
	            }

	            while (arr[j] > pivot) {
	                  j--;
	            }

	            if (i <= j) {
	                  tmp = arr[i];

	                  arr[i] = arr[j];

	                  arr[j] = tmp;

	                  i++;

	                  j--;

	            }

	      };

	     

	      return i;

	}

	 

	void quickSort(int arr[], int left, int right) {
		//System.out.println("\n   initial and recurcive  left "+left+  "    right: "+right);
	      int index = partition(arr, left, right);
        //System.out.println("\n   Next  iteration  left "+left+  "    right: "+right+ "    index: "+index);
          Arrays.stream(arr).forEach(s->System.out.print("\t"+s));
          
	      if (left < index - 1)
	      {
	    	  System.out.println("    right :"+right+ "   left :"+left+"  index - 1: "+(index - 1));
	            quickSort(arr, left, index - 1);
	      }

	      if (index < right) {
	    	  System.out.println("left :"+left+"    right :"+right+"  index : "+(index));
	            quickSort(arr, index, right);
	      }

	}
}
