class Solution{
    
    public static int partition(int[] arr, int l, int r)
    {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] <= x) {
 
                // Swapping arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
 
                i++;
            }
        }
 
        // Swapping arr[i] and arr[r]
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
 
        return i;
    }
    
    
    
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        if (k> 0 && k <= r - l + 1) {
 
            // Partition the array around last
            // element and get position of pivot
            // element in sorted array
            int pos = partition(arr, l, r);
 
            // If position is same as k
            if (pos - l == k - 1)
                return arr[pos];
 
            // If position is more, recur for
            // left subarray
            if (pos - l > k - 1)
                return kthSmallest(arr, l, pos - 1, k);
 
            // Else recur for right subarray
            return kthSmallest(arr, pos + 1, r,
                               k - pos + l - 1);
        }
 
        // If k is more than number of elements
        // in array
        return Integer.MAX_VALUE;
    } 
}
