//User function Template for Java

/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        
        pair p = null;
       long min = a[0];
       long max = a[0];
       
       for(long i: a)
       {
           if(i<min)
           {
               min=i;
           }
           if(i>max)
           {
               max=i;
           }
       }
       p = new pair(min,max);
       return p;
        
        
    }
}
