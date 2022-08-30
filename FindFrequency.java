class Solution{
    int findFrequency(int A[], int x){
        int count=0;
        int n=A.length;
        for(int i=0;i<n;i++)
        {
            if(A[i]==x)
            {
                count++;
            }
        }
        return count;
        
        
        
    }
}
