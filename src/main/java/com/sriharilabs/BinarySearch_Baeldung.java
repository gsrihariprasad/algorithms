package com.sriharilabs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearch_Baeldung {

	@Test
	public void test() {
		
		 int arr[] = {1,3,4,5,6,8,10,40};
		   int n = arr.length;
		   
		   int find_number=3;
		assertEquals(runBinarySearchRecursively(arr,find_number,0,n-1), 1);
	}
	
	public int runBinarySearchRecursively(
			  int[] sortedArray, int key, int low, int high) {
			    int middle = (low + high) / 2;
			         
			    if (high < low) {
			        return -1;
			    }
			 
			    if (key == sortedArray[middle]) {
			        return middle;
			    } else if (key < sortedArray[middle]) {
			        return runBinarySearchRecursively(
			          sortedArray, key, low, middle - 1);
			    } else {
			        return runBinarySearchRecursively(
			          sortedArray, key, middle + 1, high);
			    }
			}
}
