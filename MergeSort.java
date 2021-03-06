/* Edwin Mok
   APCS2 pd5
   HW06 -- Step 1: Split, Step 2: ?, Step 3: Sorted!
   2017-02-11 
*/

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 
  If the length of the array is greater than 1, we keep slitting it into halves until every "halves" reach the length of 1. Then, we know for sure that it is sorted, so we can merge two of the arrays with one element each and guarantee that to be sorted as well, and then we keep merging all the arrays that were split into halves and eventually will lead to the completely sorted array. 


  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] merged = new int[a.length + b.length];
	int mergeIndex = 0;
	int indexA = 0;
	int indexB = 0;
	while (indexA < a.length && indexB < b.length){
	    if (a[indexA] < b[indexB]){
	        merged[mergeIndex] = a[indexA];
		mergeIndex++;
		indexA++;
	    }
	    else if (b[indexB] < a[indexA]){
		merged[mergeIndex] = b[indexB];
		mergeIndex++;
		indexB++;
	    }
	    else {
	        merged[mergeIndex] = a[indexA];
		merged[mergeIndex + 1] = b[indexB];
		mergeIndex += 2;
		indexA++;
		indexB++;
	    }
	}
	while (indexA == a.length && indexB < b.length){
	    merged[mergeIndex] = b[indexB];
	    mergeIndex++;
	    indexB++;
	}
	while (indexB == b.length && indexA < a.length){
	    merged[mergeIndex] = a[indexA];
	    mergeIndex++;
	    indexA++;
	}
	return merged;
    }//end merge()
    

    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	if (arr.length % 2 == 0){//if the length of the array is even
	    int[] a = new int[arr.length / 2];
	    int[] b = new int[arr.length / 2];
	    int arrIndex = 0;
	    int aIndex = 0;
	    int bIndex = 0;
	    while (arrIndex < arr.length && aIndex < a.length){
		a[aIndex] = arr[arrIndex];
		aIndex++;
		arrIndex++;
	    }
	    while (arrIndex < arr.length && bIndex < b.length){
		b[bIndex] = arr[arrIndex];
		bIndex++;
		arrIndex++;
	    }
	    return merge(sort(a),sort(b));
	}
	else {//if the length of the array is odd
	    if (arr.length == 1){
		return arr;
	    }
	    else {
		int[] a = new int[(arr.length / 2) + 1];
		int[] b = new int[arr.length / 2];
		int arrIndex = 0;
		int aIndex = 0;
		int bIndex = 0;
		while (arrIndex < arr.length && aIndex < a.length){
		    a[aIndex] = arr[arrIndex];
		    aIndex++;
		    arrIndex++;
		}
		while (arrIndex < arr.length && bIndex < b.length){
		    b[bIndex] = arr[arrIndex];
		    bIndex++;
		    arrIndex++;
		}
		return merge(sort(a),sort(b));
	    }
	}
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {

	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	//	System.out.println("\nMerging arr4 and arr6: ");
	//	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
	/*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort

