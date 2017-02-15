ANALYSIS: 
As a smaller array is sorted using mergesort, the runtime is relatively small. When the items in the array reach 10,000, the process starts to take up longer runtime and grows really quickly. 
Our hypothesis for the runtime is nlogn, and based on the experiments conducted, the data shows that it is somewhere in between linear and quadratic runtime, which proves our hypothesis correct that the runtime classification for mergesort is indeed nlogn. 
We also conclude that mergesort does not have a worst case scenario and a best case scenario, because it will always split the non-1-item arrays into 1-item arrays and then recursively merge them together, and the runtime depends only on the number of items in the given array.
