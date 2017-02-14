/*======================================
  class MergeSortTester

  ALGORITHM:
  Given an array with n items, our algorithm first splits the array in halves until every halves reach a length of 1. Then, our algorithm will compare the two one-item "sorted" arrays and merge it, and recursively will merge every halves back together until it becomes a sorted array with n items again.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
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
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	int[] arr0 = makeArr(1);
	int[] arr1 = makeArr(10);
	int[] arr2 = makeArr(100);
	int[] arr3 = makeArr(1000); 
	long before, after;
	
       	System.out.println("\nSorting arr4-7...");

	before = System.currentTimeMillis();
	MergeSort.sort( arr0 );
	after = System.currentTimeMillis();
	System.out.println("Arr0: " + (after - before) + "\n");

	before = System.currentTimeMillis();
	MergeSort.sort( arr1 );
	after = System.currentTimeMillis();
	System.out.println("Arr1: " + (after - before) + "\n");

	before = System.currentTimeMillis();
	MergeSort.sort( arr2 );
	after = System.currentTimeMillis();
	System.out.println("Arr2: " + (after - before) + "\n");

	before = System.currentTimeMillis();
	MergeSort.sort( arr3 );
	after = System.currentTimeMillis();
	System.out.println("Arr3: " + (after - before) + "\n");
	
    }//end main

}//end class
