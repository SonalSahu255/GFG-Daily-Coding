class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int sum=0;
        int start=0;
   
    ArrayList<Integer> ar =new ArrayList<Integer>();
       for(int i=0;i<n;i++){
         sum = sum+arr[i];
         
         if(sum==s){
            
             ar.add(start+1);//starting index
             ar.add(i+1);//end index
              return ar; 
              
        
        
            }
             else if(sum>s){
             sum =0;
             i =start;
              start++;
         }
        }
    ArrayList<Integer> a =new ArrayList<Integer>();
    a.add(-1);
    return a;  
        
        
    }
}




