class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        
        int arr[]=new int [m+n];
      int pos = 0;  
      for (int element :a) 
       {  
          arr[pos] = element;  
           pos++;                
        } 
        for (int element :b) 
       {  
         arr[pos] = element;  
           pos++;                
        } 
   Arrays.sort(arr);
    LinkedHashSet<Integer> set=new LinkedHashSet<>();  
    for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
    }
     int array[]=new int [set.size()];
     int i=0;
     for(int x:set){
         array[i++]=x;
     }
     return array.length;
        
    }
}
