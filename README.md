#ALGORITHM:
Given an array of n items, our algorithm first splits the array into halves until there are only arrays of length 1. Then, our algorithm compares two one-item "sorted" arrays and merges them (which consists of looking at two elements at a time, one from each array, adding the smaller number to the final array, and repeating this until the process has gone through all elements in both arrays), and recursively merges every half back together until there is a single sorted array with n items again. 

#BIG-OH CLASSIFICATION OF ALGORITHM:
When splitting the given array with n items, splitting it log base 2 of n will ensure 1 item arrays, and then with merge which will make a new array of the combined size of both arrays, lets say a and b, then the loop will run a+b times which is linear. Using both splitting with a runtime of log base 2 of n and merging with runtime of n will result in a total runtime of nlogn for MergeSort method.

  Mean execution times for dataset of size n:
  Batch size: 10 <# of times each dataset size was run>
  n = 1		time: 0
  n = 10	time: 0
  n = 100	time: 0
  n = 10^3	time: 1
  n = 10^4	time: 7
  n = 10^5	time: 55
  n = 10^6	time: 359
  n = 10^7	time: 2178

#ANALYSIS: 
As a smaller array is sorted using mergesort, the runtime is relatively small. When the items in the array reach 10,000, the process starts to take up longer runtime and grows really quickly. 
Our hypothesis for the runtime is nlogn, and based on the experiments conducted, the data shows that it is somewhere in between linear and quadratic runtime, which proves our hypothesis correct that the runtime classification for mergesort is indeed nlogn. 
We also conclude that mergesort does not have a worst case scenario and a best case scenario, because it will always split the non-1-item arrays into 1-item arrays and then recursively merge them together, and the runtime depends only on the number of items in the given array.

https://docs.google.com/document/d/15cXOy-tM1X4tO3oTDIy1ExW2u-5E_zBpoRVgmaZlpx4/pub