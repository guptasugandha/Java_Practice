class LargestElement 
{ 
     static int arr[]; 
     static int largest() 
     { 
         int i; 
           
         int max = arr[0]; 
        
         for (i = 1; i < arr.length; i++) 
             if (arr[i] > max) 
                 max = arr[i];         
         return max; 
     }
