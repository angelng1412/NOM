// Team NOM - Angel Ng, Levi Olevsky, Edwin Mok
// APCS2 pd5
// HW#07 -- What Does the Data Say?
// 2017-02-14

/*======================================
  class MergeSortTester

  ALGORITHM:
  Given an array of n items, our algorithm first splits the array into halves until there are only arrays of length 1. Then, our algorithm compares two one-item "sorted" arrays and merges them (which consists of looking at two elements at a time, one from each array, adding the smaller number to the final array, and repeating this until the process has gone through all elements in both arrays), and recursively merges every half back together until there is a single sorted array with n items again. 

  BIG-OH CLASSIFICATION OF ALGORITHM:
  When splitting the given array with n items, splitting it log base 2 of n will ensure 1 item arrays, and then with merge which will make a new array of the combined size of both arrays, lets say a and b, then the loop will run a+b times which is linear. Using both splitting with a runtime of log base 2 of n and merging with runtime of n will result in a total runtime of nlogn for MergeSort method.

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 1
  n=10      time: 1
  n=100     time: 1
  n=10^3    time: 1
  n=10^4    time: 1
  n=10^5    time: 172
  n=10^6    time: 547
  n=10^7    time: 3810

  ANALYSIS:
  As a smaller array is sorted using mergesort, the runtime is relatively small. When the items in the array reach 10,000, the process starts to take up longer runtime and grows really quickly.
  Our hypothesis for the runtime is nlogn, and based on the experiments conducted, the data shows that it is somewhere in between linear and quadratic runtime, which proves our hypothesis correct that the runtime classification for mergesort is indeed nlogn.
  We also conclude that mergesort does not have a worst case scenario and a best case scenario, because it will always split the non-1-item arrays into 1-item arrays and then recursively merge them together, and the runtime depends only on the number of items in the given array.
  ======================================*/

public class MergeSortTester 
{

    public static int[] makeArr(int num){
	int[] retArr = new int[num];
	for(int i = 0; i < num; i++){
	    retArr[i] = (int)Math.random() * 10;
	}
	return retArr;
    }
    
    /******************************
     * execution time analysis 
     * We have a while loop that accounts for 9 test cases, each one increases the n count by a factor of 10 
     * Then, we calculated the time it takes for the n-item array to be completely sorted
     * In order to do that, we set a before timer and after timer and subtracted after and before to get the runtime
     ******************************/
    public static void main( String[] args ) 
    {
	int[] arr0 = makeArr(1);
	int[] arr1 = makeArr(10);
	int[] arr2 = makeArr(100);
	int[] arr3 = makeArr(1000); 
	long before, after;
	
	int counter = 0; 
	while(counter < 9){
	    before = System.currentTimeMillis();
	    MergeSort.sort(makeArr((int)Math.pow(10, counter)));
	    after = System.currentTimeMillis();
	    System.out.println("Arr of length 10^" + counter + ": " + (after - before) + "\n");
	    counter++;
	}
	
    }//end main

}//end class
